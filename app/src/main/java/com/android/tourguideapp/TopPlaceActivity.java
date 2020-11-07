package com.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view );

        ArrayList<Place> placeArrayList=new ArrayList<Place>();
        placeArrayList.add(new Place(R.drawable.unnamed,"Sukhana Lake","https://www.holidify.com/places/chandigarh/sukhna-lake-sightseeing-1528.html"));
        placeArrayList.add(new Place(R.drawable.zakir_rose_garden,"Zakir Rose Garden","https://www.holidify.com/places/chandigarh/rose-garden-sightseeing-1525.html"));
        placeArrayList.add(new Place(R.drawable.goverment_museum_and_art_gallery,"Goverment Museam","https://www.holidify.com/places/chandigarh/government-museum-and-art-gallery-sightseeing-1515.html"));
        placeArrayList.add(new Place(R.drawable.capitol_complex_tourist_center,"Capitol Complex Tourist Center","https://www.holidify.com/places/chandigarh/the-capitol-sightseeing-1530.html"));
        placeArrayList.add(new Place(R.drawable.elante_mall,"Elante Mall","https://www.holidify.com/places/chandigarh/elante-mall-sightseeing-123140.html"));
        placeArrayList.add(new Place(R.drawable.open_hand_monument,"Open Hand","https://www.holidify.com/places/chandigarh/open-hand-monument-sightseeing-123143.html"));
        placeArrayList.add(new Place(R.drawable.mc_zoological_park,"M.C. Zoological Park","https://www.holidify.com/places/chandigarh/chattbir-zoo-sightseeing-123148.html"));
        placeArrayList.add(new Place(R.drawable.international_dolls_museum,"International Dolls Museum","https://www.holidify.com/places/chandigarh/international-dolls-museum-sightseeing-1517.html"));

        PlaceAdapter placeAdapter =new PlaceAdapter(placeArrayList);
        RecyclerView rView =findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,2);
        rView.setLayoutManager(layoutManager);
        rView.setAdapter(placeAdapter);

        }
}