package com.example.pavlion.tourguideapp;

public class RestaurantsListItem {

    String restaurant_name;
    int restaurant_image;

    RestaurantsListItem(String restaurant_name,int restaurant_image){

        this.restaurant_name=restaurant_name;
        this.restaurant_image=restaurant_image;

    }

    public String getRestaurant_name(){
        return restaurant_name;
    }

    public int getRestaurant_image(){
        return restaurant_image;
    }
}
