package com.example.pavlion.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Culture extends AppCompatActivity {

    TextView hLink,cLink,fLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);

        hLink = findViewById(R.id.historicLucknow);
        if (hLink != null) {
            hLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
        cLink = findViewById(R.id.specialityLucknow);
        if (cLink != null) {
            cLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
        fLink = findViewById(R.id.foodyLucknow);
        if (fLink != null) {
            fLink.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
