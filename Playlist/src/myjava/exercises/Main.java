/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Create a program that implements a playlist of songs.
           To start you off, implement the following classes:
           1. Album
             - It has three fields:
                   * a String called name
                   * a String called artists
                   * an ArrayList that holds objects of type Song called songs
             - A constructor that accepts two Strings(name of the album and artist). It initialises the fields and
               instantiates songs.
             - Three methods:
                   * addSong(), has two parameters of
                         $ type String titleOfTheSong
                         $ type double durationOfSong
                     The method returns true if the song was added successfully or false otherwise.
                   * findSong(), has one parameter of
                         $ type String titleOfTheSong
                     The method returns the Song if it exists, null if it doesn't exists.
                   * addToPlaylist(), has two parameter of
                         $ type int trackNumberOfSongInAlbum
                         $ type LinkedList thePlaylist that holds objects of type Song
                     The methods returns true if it exists and was added successfully using the track number, or false
                     otherwise.
                   * addToPlaylist() has two parameters of
                         $ type String titleOfTheSong
                         $ type LinkedList thePlaylist that holds objects of type Song
                      The method returns true if it exists  and it was added successfully using the name of the song,
                      or false otherwise.
         2. Song
            - It has two fields:
                   * a String called title
                   * a double called duration
            - A constructor that accepts a String titleOfTheSong and a double durationOfTheSong. It initialises title
              and duration.
            - Two methods:
                   * getTitle(), getter for title
                   *toString(), Song 's overriding toString method. Returns a String in the following format:
                    "title : duration"
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

public class Main {

    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<Album>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed ", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


        LinkedList<Song>  playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed king", playlist); //Does not exist
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist); //There is no track 24

        System.out.println("My Playlist: \n");
        ListIterator<Song> i = playlist.listIterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
