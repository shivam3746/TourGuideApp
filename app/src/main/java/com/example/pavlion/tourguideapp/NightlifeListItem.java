package com.example.pavlion.tourguideapp;

public class NightlifeListItem {

     String bar_name;
     int bar_image;

     NightlifeListItem(String bar_name,int bar_image){

         this.bar_name=bar_name;
         this.bar_image=bar_image;
     }

     public String getBar_name(){
         return bar_name;
    }

    public int getBar_image(){
         return bar_image;
    }
}
