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
    private SongList songlist;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songlist = new SongList();


    }

    public boolean addSong(String titleOfTheSong, double durationOfTheSong)
    {
        if(!(new SongList().songs).contains(findSong(titleOfTheSong))) {
            songlist.add(new Song(titleOfTheSong, durationOfTheSong));
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfTheSong)
    {
        for(int i = 0; i <songlist.songs.size(); i++)
        {
            if(songlist.songs.get(i).getTitle().equals(titleOfTheSong))
                return songlist.songs.get(i);
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumberOfTheSong, LinkedList<Song> thePlaylist)
    {
        ListIterator<Song> i = thePlaylist.listIterator();
        if(trackNumberOfTheSong > songlist.songs.size() || trackNumberOfTheSong <= 0)
            return false;
        else
            addToPlaylist(songlist.songs.get(trackNumberOfTheSong-1).getTitle(), thePlaylist);
        return true;

    }

    public boolean addToPlaylist(String titleOfTheSong, LinkedList<Song> thePlaylist)
    {
        ListIterator<Song> i = thePlaylist.listIterator();
        if(songlist.songs.contains(findSong(titleOfTheSong)))
        {
            thePlaylist.add(findSong(titleOfTheSong));
            return true;
        }

        return false;
    }

    public static class SongList{

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();

        }

        private boolean add(Song song)
        {
            for(int i = 0; i <songs.size(); i++)
            {
                if(songs.contains(song))
                    return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String nameOfTheSong)
        {
            for(int i =0; i < songs.size(); i++)
            {
                if(songs.get(i).getTitle().equals(nameOfTheSong))
                    return songs.get(i);
            }
            return null;

        }

        private Song findSong(int trackNumberOfTheSongInTheAlbum)
        {

                if(songs.get(trackNumberOfTheSongInTheAlbum)!= null )
                    return songs.get(trackNumberOfTheSongInTheAlbum);

            return null;

        }
    }

}