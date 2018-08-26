package com.example.pavlion.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Popular extends AppCompatActivity {

    List<PopularListItem> popList;
    ListView lv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);

        popList=new ArrayList<>();
        lv4=findViewById(R.id.popular_things);

        popList.add(new PopularListItem(getResources().getString(R.string.p1),R.drawable.tokrichaat));
        popList.add(new PopularListItem(getResources().getString(R.string.p2),R.drawable.roganjosh));
        popList.add(new PopularListItem(getResources().getString(R.string.p3),R.drawable.malaikigilori));
        popList.add(new PopularListItem(getResources().getString(R.string.p4),R.drawable.lucknawibiryani));
        popList.add(new PopularListItem(getResources().getString(R.string.p5),R.drawable.prakashlikulfi));
        popList.add(new PopularListItem(getResources().getString(R.string.p6),R.drawable.sheermals));

        PopularAdapter adapter = new PopularAdapter(this, R.layout.popular_list ,popList);

        lv4.setAdapter(adapter);
    }
}
