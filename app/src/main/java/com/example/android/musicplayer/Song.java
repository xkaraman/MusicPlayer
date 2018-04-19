package com.example.android.musicplayer;

/**
 * Created by xenakis on 19/4/2018.
 */

public class Song {

    private final String mName;
    private final String mArtist;
    private final String mAlbum;

    public Song(String name,String artist,String album) {
        mName = name;
        mArtist = artist;
        mAlbum = album;
    }

    public String getName() {
        return mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }
}
