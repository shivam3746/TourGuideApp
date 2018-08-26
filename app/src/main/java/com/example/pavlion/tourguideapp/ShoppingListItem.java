package com.example.pavlion.tourguideapp;

public class ShoppingListItem {

    String shopping_center_name;
    int shopping_center_image;

    ShoppingListItem(String shopping_center_name,int shopping_center_image){

        this.shopping_center_name=shopping_center_name;
        this.shopping_center_image=shopping_center_image;

    }

    public String getShopping_center_name(){
        return shopping_center_name;
    }

    public int getShopping_center_image(){
        return shopping_center_image;
    }
}
