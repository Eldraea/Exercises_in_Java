/*
Main java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge: Implement the command() method in the Main Class to allow players to type full words, or phrases, then move
           to the correct location based upon their input.
           The player should be able to type commands such as "Go West", "Run South", "I need to Quit this game" or just
           "EAST" and the program will move to the appropriate location if there is one. The console should display its
           current location, then it should prompt the user with: "Available exists are " and its available exits.
           A move in a valid direction should print (keep in mind N, S, E, and  variants ).
           An attempt to move in an invalid direction should print a message and remain in the same place. The printed
           message should be: "You cannot go int that direction".
           Single letters commands (N,W,S,E,Q) should still be available.

------------------------------------------------------------------------------------------------------------------------
Created on 02/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 21/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {




        locations.put(0, new Location(0, "You are sitting in front of a computer Learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of the road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of the hill"));
        locations.put(3, new Location(3, "You are inside of a building a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        //Exits for room 1
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);


        //Exits for room 2
        locations.get(2).addExit("N", 5);

        //Exits for room 3
        locations.get(3).addExit("W", 1);


        //Exits for room 4
        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);


        //Exits for the room 5
        locations.get(5).addExit("W", 3);
        locations.get(5).addExit("S", 1);

        command();

    }

    public static void command()
    {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> vocabulary = new HashMap<>();

        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("QUIT", "Q");

        int loc =1;

        while (true)
        {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
            {
                break;
            }
            Map <String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for( String string : exits.keySet())
            {
                System.out.print(string+ " ");
            }
            System.out.println();

            String[] direction = scanner.nextLine().toUpperCase().split(" ");
            String nextDirection = "Default Direction";

            if(direction.length > 1) {
                for (String s : direction) {

                if(vocabulary.containsKey(s)) {
                    nextDirection = vocabulary.get(s);
                    break;
                }
                }
            }

            if(exits.containsKey(nextDirection))
            {
                loc = exits.get(nextDirection);
            }
            else
            {
                System.out.println("You cannot go in that direction");
            }

        }
        scanner.close();
    }
}
