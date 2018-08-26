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

public class NightlifeAdapter extends ArrayAdapter<NightlifeListItem> {

    private List<NightlifeListItem> barList;
    private Context context;
    int resource;

    NightlifeAdapter(Context context, int resource, List<NightlifeListItem> barList) {
        super(context, resource, barList);
        this.context = context;
        this.resource = resource;
        this.barList = barList;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;
        view = layoutInflater.inflate(resource, null, false);

        TextView barName = view.findViewById(R.id.nightlifeName);
        ImageView barImage = view.findViewById(R.id.nightlifeImage);

        String bar = barList.get(position).getBar_name();
        int img_bar = barList.get(position).getBar_image();

        barName.setText(bar);
        barImage.setImageResource(img_bar);


        return view;

    }
}