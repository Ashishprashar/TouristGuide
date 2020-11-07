package com.android.tourguideapp;

public class Place {
    int imageResourcesId;
    String placeName;
    String url;

    public Place(int imageResourcesId, String placeName, String url) {
        this.imageResourcesId = imageResourcesId;
        this.placeName = placeName;
        this.url=url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Place(int imageResourcesId, String placeName) {
        this.imageResourcesId = imageResourcesId;
        this.placeName = placeName;
    }

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    public void setImageResourcesId(int imageResourcesId) {
        this.imageResourcesId = imageResourcesId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
