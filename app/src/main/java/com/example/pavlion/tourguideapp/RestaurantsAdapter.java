package com.example.pavlion.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RestaurantsAdapter extends ArrayAdapter<RestaurantsListItem> {

    private List<RestaurantsListItem> restaurantList;
    private Context context;
    int resource;

    RestaurantsAdapter(Context context, int resource, List<RestaurantsListItem> restaurantList) {
        super(context, resource, restaurantList);
        this.context = context;
        this.resource = resource;
        this.restaurantList = restaurantList;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;
        view = layoutInflater.inflate(resource, null, false);

        TextView restaurantName = view.findViewById(R.id.restaurantName);
        ImageView restaurantImage = view.findViewById(R.id.restaurantImage);

        String restaurant = restaurantList.get(position).getRestaurant_name();
        int img_restaurant = restaurantList.get(position).getRestaurant_image();

        restaurantName.setText(restaurant);
        restaurantImage.setImageResource(img_restaurant);


        return view;

    }
}
