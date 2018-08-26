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

public class PopularAdapter extends ArrayAdapter<PopularListItem> {

    private List<PopularListItem> popList;
    private Context context;
    int resource;

    PopularAdapter(Context context, int resource, List<PopularListItem> popList) {
        super(context, resource, popList);
        this.context = context;
        this.resource = resource;
        this.popList = popList;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;
        view = layoutInflater.inflate(resource, null, false);

        TextView popName = view.findViewById(R.id.popName);
        ImageView popImage = view.findViewById(R.id.popImage);

        String pop = popList.get(position).getPopularname();
        int img_pop = popList.get(position).getPopularimage();

        popName.setText(pop);
        popImage.setImageResource(img_pop);

        return view;

    }
}
