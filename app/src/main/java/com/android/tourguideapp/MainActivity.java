package com.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button topPlacesButton,restaurantsButton,historicalButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setView();
        topPlacesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TopPlaceActivity.class);
                startActivity(intent);
            }
        });
        restaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RestaurantActivity.class);
                startActivity(intent);
            }
        });
        historicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HistoriocalPlaceActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setView() {
        topPlacesButton=findViewById(R.id.top_places_button);
        restaurantsButton=findViewById(R.id.restaurants);
        historicalButton=findViewById(R.id.historical_places_buttons);
    }
}