package com.example.pavlion.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login_btn);

      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i;
              i=new Intent(MainActivity.this,CitiesList.class);
              startActivity(i);
          }
      });
    }
}
