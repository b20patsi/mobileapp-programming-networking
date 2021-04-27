package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    @SerializedName("ID")
    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("size")
    private int height;
    @SerializedName("cost")
    private int feet;
    private Auxdata auxdata;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }
}
