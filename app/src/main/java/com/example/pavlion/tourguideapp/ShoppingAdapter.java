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

public class ShoppingAdapter extends ArrayAdapter<ShoppingListItem> {

    private List<ShoppingListItem> shoppingcenterList;
    private Context context;
    int resource;

    ShoppingAdapter(Context context, int resource, List<ShoppingListItem> shoppingcenterList) {
        super(context, resource, shoppingcenterList);
        this.context = context;
        this.resource = resource;
        this.shoppingcenterList = shoppingcenterList;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view;
        view = layoutInflater.inflate(resource, null, false);

        TextView shoppingCenterName = view.findViewById(R.id.shoppingCenterName);
        ImageView shoppingCenterImage = view.findViewById(R.id.shoppingCenterImage);

        String shoppingCenter = shoppingcenterList.get(position).getShopping_center_name();
        int img_shoppingCenter = shoppingcenterList.get(position).getShopping_center_image();

        shoppingCenterName.setText(shoppingCenter);
        shoppingCenterImage.setImageResource(img_shoppingCenter);


        return view;

    }
}