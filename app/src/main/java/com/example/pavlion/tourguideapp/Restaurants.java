package com.example.pavlion.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Restaurants extends AppCompatActivity {

    List<RestaurantsListItem> resList;
    ListView lv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        resList=new ArrayList<>();
        lv3=findViewById(R.id.restaurant);

        resList.add(new RestaurantsListItem(getResources().getString(R.string.r1),R.drawable.alldaydining));
        resList.add(new RestaurantsListItem(getResources().getString(R.string.r2),R.drawable.babian));
        resList.add(new RestaurantsListItem(getResources().getString(R.string.r3),R.drawable.bbqnation));
        resList.add(new RestaurantsListItem(getResources().getString(R.string.r4),R.drawable.chungfa));
        resList.add(new RestaurantsListItem(getResources().getString(R.string.r5),R.drawable.ritz));
        resList.add(new RestaurantsListItem(getResources().getString(R.string.r6),R.drawable.percusion));

        RestaurantsAdapter adapter = new RestaurantsAdapter(this, R.layout.restaurant_list ,resList);

        lv3.setAdapter(adapter);
    }
}
