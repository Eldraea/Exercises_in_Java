/*
Demo.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Demo class
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
    addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");


        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        placesToVisit.remove(4);

        printList(placesToVisit);
        visit(placesToVisit);



    }

    private static void printList(LinkedList<String> myList)
    {
        Iterator<String> i = myList.iterator();

        while(i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================================================");

    }

    private static boolean addInOrder (LinkedList<String> linkedList, String newCity)
    {

        ListIterator<String> i = linkedList.listIterator();

        while(i.hasNext())
        {
            
            int comparison = i.next().compareTo(newCity);

            if(comparison == 0)
            {
                //equal, do no add
                System.out.println((newCity)+ " is already included as a destination");

                return false;
            }
            else if(comparison>0)
            {
                //newCity should appear before this one
                //Brisbane ->Adelaide
                i.previous();
                linkedList.add(newCity);
                return true;

            }
            else if(comparison <0)
            {
                //move on to the next city
            }

        }
        i.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities)
    {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> i = cities.listIterator();

        if(cities.getFirst().isEmpty() ) {
            System.out.println("No cities in the itinerary");
            return;
        }
        else {
            System.out.println("Now visiting " + i.next());
            printMenu();
        }

        while(!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action)
            {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit  =true;
                    break;
                case 1:
                    if(!goingForward) {
                        if (i.hasNext())
                            i.next();
                        goingForward = true;

                    }
                    if(i.hasNext()){
                        System.out.println("Now visiting " + i.next());

                    }

                    else{
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if (i.hasPrevious())
                            i.previous();
                        goingForward = false;

                    }
                        if(i.hasPrevious())
                        {
                            System.out.println("Now visiting " + i.previous());
                            goingForward = false;
                        }
                    else{
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }


    }

    private static void printMenu()
    {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit");
        System.out.println("1 - Go to next city");
        System.out.println("2 - Go to previous city");
        System.out.println("3- Print Menu Options");
    }

}
