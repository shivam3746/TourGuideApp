package com.example.pavlion.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class LocationsAdapter extends ArrayAdapter<ListItem> {


    private List<ListItem> locationList;
    private Context context;
    int resource;

    LocationsAdapter(Context context, int resource, List<ListItem> locationList) {
        super(context, resource, locationList);
        this.context = context;
        this.resource = resource;
        this.locationList = locationList;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;
        view = layoutInflater.inflate(resource, null, false);

        ListItem location = locationList.get(position);

        TextView locationName = view.findViewById(R.id.location_name);
        locationName.setText(location.getLocation());

        return view;
    }
}

