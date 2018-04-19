package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        ArrayList<String> artists = new ArrayList<>();

        artists.add("Alice");
        artists.add("Swedish House Mafia");
        artists.add("Imagine Dragons");
        artists.add("The Chainsmokers");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, artists);

        ListView listView = findViewById(R.id.artistlist);

        listView.setAdapter(adapter);
    }
}
