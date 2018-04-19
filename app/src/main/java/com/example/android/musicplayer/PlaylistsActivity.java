package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ArrayList<String> playlists = new ArrayList<>();

        playlists.add("Rock");
        playlists.add("80s");
        playlists.add("EDM");
        playlists.add("Jazz");
        playlists.add("Swing");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, playlists);

        ListView listView = findViewById(R.id.playlistlist);

        listView.setAdapter(adapter);
    }
}
