package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("No Roots", "Alice Merton", "No Roots"));
        songs.add(new Song("Greyhound", "Swedish House Mafia", "Until Now"));
        songs.add(new Song("Believers", "Imagine Dragons", "Evolve"));
        songs.add(new Song("Something Just Like This", "The Chainsmokers", " Memories...Do Not Open"));
        songs.add(new Song("Right Here, Right Now", "Fatboy Slim", "You've Come a Long Way, Baby"));
        songs.add(new Song("Sandstrom", "Darude", "Before the Storm"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called librarylist, which is declared in the
        // library_activity layout file.
        ListView listView = findViewById(R.id.librarylist);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
