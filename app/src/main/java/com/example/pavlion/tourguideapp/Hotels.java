package com.example.pavlion.tourguideapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;



public class Hotels extends AppCompatActivity  {

    @SuppressLint("StaticFieldLeak")
    public static Hotels instance;
    private HotelPagerAdapter adapter;
    private ViewPager viewPager;
    private TabLayout allTabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        instance=this;
        getAllWidgets();
        setupViewPager();
    }
    public static Hotels getInstance() {
        return instance;
    }
    private void getAllWidgets() {
        viewPager = findViewById(R.id.viewpager);
        allTabs = findViewById(R.id.sliding_tabs);
        allTabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }
    private void setupViewPager() {
        adapter = new HotelPagerAdapter(getSupportFragmentManager());
        Tab1 fragmentOne = new Tab1();
        Tab2 fragmentTwo = new Tab2();
        Tab3 fragmentThree = new Tab3();
        adapter.addFragment(fragmentOne);
        adapter.addFragment(fragmentTwo);
        adapter.addFragment(fragmentThree);
        setViewPageAdapter();
    }
    private void setViewPageAdapter() {
        viewPager.setAdapter(adapter);
        allTabs.setupWithViewPager(viewPager);
    }

}





