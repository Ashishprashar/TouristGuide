package com.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HistoriocalPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        ArrayList<Place> placeArrayList =new ArrayList<Place>();
        placeArrayList.add(new Place(R.drawable.rock_garden,"Rock Garden","https://www.holidify.com/places/chandigarh/rock-garden-sightseeing-1524.html"));
        placeArrayList.add(new Place(R.drawable.shanti_kunj,"Shanti Kunaj","https://www.holidify.com/places/chandigarh/shanti-kunj-sightseeing-1526.html"));
        placeArrayList.add(new Place(R.drawable.capitol_complex,"Capitol Complex","https://www.holidify.com/places/chandigarh/the-capitol-sightseeing-1530.html"));
        placeArrayList.add(new Place(R.drawable.le_corbusier_centre,"Le Corbusier Center","https://www.holidify.com/places/chandigarh/le-corbusier-centre-sightseeing-123142.html"));
        placeArrayList.add(new Place(R.drawable.fort_ramgarh,"Fort Ramgarh","https://www.holidify.com/places/nalagarh/ramgarh-fort-sightseeing-5396.html"));
        placeArrayList.add(new Place(R.drawable.nada_sahib,"Nada Sahib","http://www.haryanatourism.gov.in/Destination/nada-sahib"));
        placeArrayList.add(new Place(R.drawable.jayanti_devi_temple,"Jayanti Devi Temple","http://www.famousindiantemples.com/listings/jayanti-devi-temple/"));
        placeArrayList.add(new Place(R.drawable.shri_mata_mansa_devi_mandir,"Mata Mansa Devi Mandir","https://mansadevi.org.in/"));


        PlaceAdapter placeAdapter =new PlaceAdapter(placeArrayList);
        RecyclerView rView =findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager =new GridLayoutManager(this,2);
        rView.setLayoutManager(layoutManager);
        rView.setAdapter(placeAdapter);
    }
}