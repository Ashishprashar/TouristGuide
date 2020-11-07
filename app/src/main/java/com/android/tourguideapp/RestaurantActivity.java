package com.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        ArrayList<Place> placeArrayList =new ArrayList<Place>();
        placeArrayList.add(new Place(R.drawable.the_cafe,"The Cafe","https://www.tripadvisor.in/Restaurant_Review-g297596-d3155873-Reviews-The_Cafe_JW-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.saffron,"Saffron","https://www.tripadvisor.in/Restaurant_Review-g297596-d2693220-Reviews-Saffron-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.barbeque_nation,"Barbeque Nation","https://www.tripadvisor.in/Restaurant_Review-g297596-d1027771-Reviews-Barbeque_Nation-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.virgin_courtyard,"Virgin CourtYard","https://www.tripadvisor.in/Restaurant_Review-g297596-d3792344-Reviews-Virgin_Courtyard-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.dera,"Dera","https://www.tripadvisor.in/Restaurant_Review-g297596-d796121-Reviews-Dera-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.oko,"OKO","https://www.tripadvisor.in/Restaurant_Review-g297596-d8019498-Reviews-OKO-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.mainland_china,"Mainland China","https://www.tripadvisor.in/Restaurant_Review-g297596-d1811729-Reviews-Mainland_China-Chandigarh.html"));
        placeArrayList.add(new Place(R.drawable.urban_cafe,"Urban Cafe","https://www.tripadvisor.in/Restaurant_Review-g297596-d10453286-Reviews-Urban_Cafe-Chandigarh.html"));



        PlaceAdapter placeAdapter =new PlaceAdapter(placeArrayList);
        RecyclerView rView =findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager =new GridLayoutManager(this,2);
        rView.setLayoutManager(layoutManager);
        rView.setAdapter(placeAdapter);
    }
}