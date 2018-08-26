package com.example.pavlion.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CitiesList extends AppCompatActivity {

    List<ListItem> locationList;

    //the listview
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_list);

        locationList = new ArrayList<>();
        listView = findViewById(R.id.locations);

        //adding some values to our list
        locationList.add(new ListItem(getResources().getString(R.string.ct_1)));
        locationList.add(new ListItem(getResources().getString(R.string.ct_2)));
        locationList.add(new ListItem(getResources().getString(R.string.ct_3)));
        locationList.add(new ListItem(getResources().getString(R.string.ct_4)));
        locationList.add(new ListItem(getResources().getString(R.string.ct_5)));
        locationList.add(new ListItem(getResources().getString(R.string.ct_6)));

        //creating the adapter
        LocationsAdapter adapter = new LocationsAdapter(this, R.layout.locations_list, locationList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i;
                i=new Intent(CitiesList.this,options.class);
                switch (position)
                {
                    case 0:
                        Toast.makeText(CitiesList.this, getResources().getString(R.string.Toast_msg), Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(CitiesList.this, getResources().getString(R.string.Toast_msg), Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        startActivity(i);
                        break;
                    case 3:
                        Toast.makeText(CitiesList.this, getResources().getString(R.string.Toast_msg), Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(CitiesList.this, getResources().getString(R.string.Toast_msg), Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(CitiesList.this, getResources().getString(R.string.Toast_msg), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        }



}

