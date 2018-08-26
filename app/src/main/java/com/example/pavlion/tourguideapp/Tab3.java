package com.example.pavlion.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hotel_tab3, container, false);

        ListView lv = rootView.findViewById(R.id.FiveStarHotels);
        HotelsAdapter adapter = new HotelsAdapter(this.getActivity(), getFiveStarHotels());
        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<HotelList> getFiveStarHotels() {

        ArrayList<HotelList> hotels = new ArrayList<>();

        HotelList FiveStarHotels = new HotelList(getResources().getString(R.string.htl_17),R.drawable.hyattregency);
        hotels.add(FiveStarHotels);

         FiveStarHotels = new HotelList(getResources().getString(R.string.htl_18),R.drawable.radisson);
        hotels.add(FiveStarHotels);

         FiveStarHotels = new HotelList(getResources().getString(R.string.htl_19),R.drawable.ramada);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_20),R.drawable.novotel);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_21),R.drawable.renaissance);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_22),R.drawable.clarksavadh);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_23),R.drawable.vivantabytaj);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_24),R.drawable.piccadily);
        hotels.add(FiveStarHotels);

        FiveStarHotels = new HotelList(getResources().getString(R.string.htl_25),R.drawable.lebua);
        hotels.add(FiveStarHotels);

        return hotels;

    }

    public String toString(){
        return "5 star";
    }
}