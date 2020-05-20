package com.example.firstapplication;

import android.graphics.drawable.Drawable;

public class MyListViewItem {

    private Drawable profilePicture;
    private String name;
    private String identifier;
    private  String updateTime;
    private  String tweet;

    public MyListViewItem(Drawable profilePicture, String name, String identifier, String updateTime, String tweet) {
        this.profilePicture = profilePicture;
        this.name = name;
        this.identifier = identifier;
        this.updateTime = updateTime;
        this.tweet = tweet;
    }


    public Drawable getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Drawable profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
}
