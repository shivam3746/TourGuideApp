package com.example.pavlion.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Nightlife extends AppCompatActivity {

    List<NightlifeListItem> barList;
     ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightlife);

        barList=new ArrayList<>();
        lv1=findViewById(R.id.nightlife);

        barList.add(new NightlifeListItem(getResources().getString(R.string.n1),R.drawable.zerodegree));
        barList.add(new NightlifeListItem(getResources().getString(R.string.n2),R.drawable.aura));
        barList.add(new NightlifeListItem(getResources().getString(R.string.n3),R.drawable.mirage));
        barList.add(new NightlifeListItem(getResources().getString(R.string.n4),R.drawable.jailcafe));
        barList.add(new NightlifeListItem(getResources().getString(R.string.n5),R.drawable.skybar));

        NightlifeAdapter adapter = new NightlifeAdapter(this, R.layout.nightlife_list ,barList);

        lv1.setAdapter(adapter);

    }

}
