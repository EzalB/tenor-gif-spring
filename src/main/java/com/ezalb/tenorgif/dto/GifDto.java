package com.ezalb.tenorgif.dto;

import java.util.ArrayList;

// This is JSON model

class Gif{
    public String url;
    public double duration;
    public String preview;
    public ArrayList<Integer> dims;
    public int size;
}

class Gifpreview{
    public String url;
    public double duration;
    public String preview;
    public ArrayList<Integer> dims;
    public int size;
}

class MediaFormats{
    public Gifpreview gifpreview;
    public Gif gif;
}

class Result{
    public String id;
    public String title;
    public MediaFormats media_formats;
    public double created;
    public String content_description;
    public String itemurl;
    public String url;
    public ArrayList<String> tags;
    public ArrayList<Object> flags;
    public boolean hasaudio;    
}

public class GifDto {
    public ArrayList<Result> results;
    public String next;
}

/*
public class Root{
    public ArrayList<Result> results;
    public String next;
}
*/