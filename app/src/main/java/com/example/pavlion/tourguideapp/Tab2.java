package com.example.pavlion.tourguideapp;


import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.String;

import java.util.ArrayList;

public class Tab2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hotel_tab2, container, false);

        ListView lv = rootView.findViewById(R.id.FourStarHotels);
        HotelsAdapter adapter = new HotelsAdapter(this.getActivity(), getFourStarHotels());
        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<HotelList> getFourStarHotels() {

        ArrayList<HotelList> hotels = new ArrayList<>();

        HotelList FourStarHotels = new HotelList(getResources().getString(R.string.htl_8), R.drawable.hotelsilvette);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_9), R.drawable.fortunepark);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_10), R.drawable.savvygrand);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_11), R.drawable.levanasuites);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_12), R.drawable.dayalparadise);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_13), R.drawable.goldentulip);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_14), R.drawable.cygnettparkdiarch);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_15), R.drawable.vijayparadise);
        hotels.add(FourStarHotels);

        FourStarHotels = new HotelList(getResources().getString(R.string.htl_16), R.drawable.revanta);
        hotels.add(FourStarHotels);

        return hotels;

    }

    public String toString() {

        return "4 star";

    }
}