package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        ImageView library = findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open then {@link NumbersActivity}
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                //Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView artists = findViewById(R.id.artist);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open then {@link NumbersActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                //Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView playlists = findViewById(R.id.playlist);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open then {@link NumbersActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                //Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the numbers category
        ImageView search = findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open then {@link NumbersActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                //Start the new activity
                startActivity(searchIntent);
            }
        });


    }
}
