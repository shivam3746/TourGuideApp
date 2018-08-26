package com.example.pavlion.tourguideapp;

public class HotelList {

    String name;
    int image;

    HotelList(String name, int image){
        this.name=name;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
