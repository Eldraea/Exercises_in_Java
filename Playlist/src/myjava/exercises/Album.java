/*
Album.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Album class
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfTheSong, double durationOfTheSong)
    {
        if(!songs.contains(findSong(titleOfTheSong))) {
            songs.add(new Song(titleOfTheSong, durationOfTheSong));
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfTheSong)
    {
        for(int i = 0; i <songs.size(); i++)
        {
            if(songs.get(i).getTitle().equals(titleOfTheSong))
                return songs.get(i);
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumberOfTheSong, LinkedList<Song> thePlaylist)
    {
        ListIterator<Song> i = thePlaylist.listIterator();
        if(trackNumberOfTheSong > songs.size() || trackNumberOfTheSong <= 0)
            return false;
        else
            addToPlaylist(songs.get(trackNumberOfTheSong-1).getTitle(), thePlaylist);
            return true;

    }

    public boolean addToPlaylist(String titleOfTheSong, LinkedList<Song> thePlaylist)
    {
        ListIterator<Song> i = thePlaylist.listIterator();
        if(songs.contains(findSong(titleOfTheSong)))
        {
            thePlaylist.add(findSong(titleOfTheSong));
            return true;
        }

        return false;
    }


}
