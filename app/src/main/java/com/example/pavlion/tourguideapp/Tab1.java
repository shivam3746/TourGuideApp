package com.example.pavlion.tourguideapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Tab1 extends Fragment {


    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.hotel_tab1, container, false);

        ListView lv = rootView.findViewById(R.id.ThreeStarHotels);
        HotelsAdapter adapter = new HotelsAdapter(this.getActivity(), getThreeStarHotels());
        lv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<HotelList> getThreeStarHotels() {

        ArrayList<HotelList> hotels = new ArrayList<>();

        HotelList ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_1), R.drawable.psinternational);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_2), R.drawable.gingerhotel);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_3), R.drawable.goldenorchid);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_4), R.drawable.deepawadh);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_5), R.drawable.ivystays);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_6), R.drawable.royalinn);
        hotels.add(ThreeStarHotels);

        ThreeStarHotels = new HotelList(getResources().getString(R.string.htl_7), R.drawable.lpsportico);
        hotels.add(ThreeStarHotels);

        return hotels;

    }

    public String toString() {
        return "3 star" ;
    }

}