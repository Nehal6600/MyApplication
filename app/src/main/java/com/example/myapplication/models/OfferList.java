package com.example.myapplication.models;

public class OfferList {
    String name;
    Integer getImageUrl;

    public OfferList(String name, Integer getImageUrl) {
        this.name = name;
        this.getImageUrl = getImageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGetImageUrl() {
        return getImageUrl;
    }

    public void setGetImageUrl(Integer getImageUrl) {
        this.getImageUrl = getImageUrl;
    }
}

