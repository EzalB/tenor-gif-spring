package com.ezalb.tenorgif.controller;

import com.ezalb.tenorgif.dto.GifDto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RequestMapping("/gif")
@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class GifController {

    @Value("${apiKey}")
    private String API_KEY;

    @Value("${clientKey}")
    private String CLIENT_KEY;

    @GetMapping("/")
    public String home() {
        return "Hello! Welcome home...";
    }

    @GetMapping("/search")
    @CrossOrigin(origins = "http://localhost:3000")
    public GifDto searchResult(@RequestParam("query") String parameter, @RequestParam(required = false, value = "pos") String pos) throws JsonProcessingException {

        String url = "https://tenor.googleapis.com/v2/search?q=" + parameter + "&key=" + API_KEY + "&client_key=" + CLIENT_KEY + "&limit=8" + "&media_filter=gif,gifpreview";

         if(Objects.nonNull(pos)) {
            url += "&pos=" + pos;
        }

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);

        ObjectMapper om = new ObjectMapper();
        GifDto gifDto = om.readValue(result, GifDto.class);

        return gifDto;
    }

}