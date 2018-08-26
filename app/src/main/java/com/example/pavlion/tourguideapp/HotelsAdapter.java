package com.example.pavlion.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelsAdapter extends BaseAdapter {

    Context c;
    ArrayList<HotelList> hotels;

    LayoutInflater inflater;

    HotelsAdapter(Context c, ArrayList<HotelList> hotels) {
        this.c = c;
        this.hotels = hotels;
    }

    @Override
    public int getCount() {
        return hotels.size();
    }

    @Override
    public Object getItem(int position) {
        return hotels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            assert inflater != null;
            convertView=inflater.inflate(R.layout.hotel_list_model,parent,false);
        }

        TextView nameTxt= convertView.findViewById(R.id.hotelName);
        ImageView img=  convertView.findViewById(R.id.hotelImage);

        final String name=hotels.get(position).getName();
        int image=hotels.get(position).getImage();

        nameTxt.setText(name);
        img.setImageResource(image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}