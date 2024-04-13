package com.ezalb.tenorgif.model;

import java.util.Arrays;

public class GifModel {
    private long id;
    private String title;
    private String [] mediaFormats;
    private String url;
    private String [] tags;

    public GifModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getMediaFormats() {
        return mediaFormats;
    }

    public void setMediaFormats(String[] mediaFormats) {
        this.mediaFormats = mediaFormats;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "GifModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", mediaFormats=" + Arrays.toString(mediaFormats) +
                ", url='" + url + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
