package com.example.pavlion.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Shopping extends AppCompatActivity {

    List<ShoppingListItem> shoppingcenterList;
    ListView lv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        shoppingcenterList=new ArrayList<>();
        lv2=findViewById(R.id.shopping);

        shoppingcenterList.add(new ShoppingListItem(getResources().getString(R.string.s1),R.drawable.saharaganj));
        shoppingcenterList.add(new ShoppingListItem(getResources().getString(R.string.s2),R.drawable.funrepublic));
        shoppingcenterList.add(new ShoppingListItem(getResources().getString(R.string.s3),R.drawable.phoenixmall));
        shoppingcenterList.add(new ShoppingListItem(getResources().getString(R.string.s4),R.drawable.bigbazaar));



        ShoppingAdapter adapter = new ShoppingAdapter(this, R.layout.shopping_list ,shoppingcenterList);

        lv2.setAdapter(adapter);
    }
}
