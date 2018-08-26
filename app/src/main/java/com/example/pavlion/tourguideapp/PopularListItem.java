package com.example.pavlion.tourguideapp;

public class PopularListItem {

    String popularname;
    int popularimage;

    PopularListItem(String popularname,int popularimage){

        this.popularname=popularname;
        this.popularimage=popularimage;

    }

    public String getPopularname(){
        return popularname;
    }

    public int getPopularimage(){
        return popularimage;
    }
}
