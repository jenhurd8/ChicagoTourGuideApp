package com.example.android.chicagotourguideapp;

import java.util.ArrayList;

public class EventObject {

    /***single event name, location and image reference ***/
    private String mName;
    private String mLocation;
    private int mImageId;

    /**single event object constructor***/
//    public EventObject(ArrayList Event){
//        this.name  = name;
//        this.location = location;
//        this.imageId = imageId;
//    }

    public EventObject(String name, String location, int imageId){
        this.mName  = name;
        this.mLocation = location;
        this.mImageId = imageId;
    }

    /***getters for name, location, and image id***/
    public String getName(){
        return mName;
    }

    public String getLocation(){
        return mLocation;
    }
    public int getImageId(){
        return mImageId;
    }
}
