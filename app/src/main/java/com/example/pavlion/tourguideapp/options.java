package com.example.pavlion.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        ImageView hotel,nightlife,shopping,restaurants,popular,culture;
        hotel = findViewById(R.id.Hotels);
        nightlife = findViewById(R.id.Nightlife);
        shopping = findViewById(R.id.shopping);
        restaurants = findViewById(R.id.restaurants);
        culture = findViewById(R.id.culture);
        popular = findViewById(R.id.popular);


        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1;
                i1= new Intent(options.this,Hotels.class);
                startActivity(i1);
            }
        });

        nightlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2;
                i2 = new Intent(options.this,Nightlife.class);
                startActivity(i2);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3;
                i3=new Intent(options.this,Shopping.class);
                startActivity(i3);
            }
        });

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4;
                i4=new Intent(options.this,Restaurants.class);
                startActivity(i4);
            }
        });

        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5;
                i5=new Intent(options.this,Popular.class);
                startActivity(i5);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6;
                i6=new Intent(options.this,Culture.class);
                startActivity(i6);
            }
        });


    }
}
