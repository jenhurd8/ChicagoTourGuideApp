package com.example.android.chicagotourguideapp;

public class EventObject {

    /***single event name, location and image reference ***/
    private String name;
    private String location;
    private String imageId;

    /**single event object constructor***/
    public EventObject(String name, String location, String imageId){
        this.name  = name;
        this.location = location;
        this.imageId = imageId;
    }

    /***getters for name, location, and image id***/
    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
    public String getImageId(){
        return imageId;
    }
}
