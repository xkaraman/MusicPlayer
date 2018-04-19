package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by xenakis on 19/4/2018.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    /**
     * Constructor
     */
    public SongAdapter(@NonNull Context context, ArrayList<Song> words ) {
        super(context,0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songName =  listItemView.findViewById(R.id.song_name);
        // set this text on the name TextView
        songName.setText(currentSong.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        // set this text on the number TextView
        songArtist.setText(currentSong.getArtist());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songAlbum = listItemView.findViewById(R.id.song_album);
        // set this text on the number TextView
        songAlbum.setText(currentSong.getAlbum());

        final ImageView play = listItemView.findViewById(R.id.libraryplay);
        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open then {@link NumbersActivity}
                Intent playIntent = new Intent( play.getContext(), NowPlaying.class);
                //Start the new activity
                play.getContext().startActivity(playIntent);
            }
        });

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}