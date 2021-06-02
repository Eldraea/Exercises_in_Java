/*
Theatre.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
The Theatre class
------------------------------------------------------------------------------------------------------------------------
Created on: 02/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 02/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package myjava.exercises;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Theatre {

    private final String theatreName;
    private final List<Seat> seats= new ArrayList<>();

    public Theatre(String theatreName, int numberOfRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A'+(numberOfRows -1);
        for( char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNum =1; seatNum <= seatsPerRow; seatNum++)
            {
                seats.add(new Seat(row +String.format("%02d", seatNum)));
            }
        }

    }
    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat( String seatNumber)
    {
        Seat requestedSeat = new Seat((seatNumber));
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0)
        {
            return seats.get(foundSeat).reserve();
        }
        else
            System.out.println("There is no seat " + seatNumber);
        return false;
    }

    //for testing
    public void getSeats()
    {
        for (Seat seat: seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve()
        {
            if(!this.reserved)
            {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + "  reserved.");
                return true;
            }
            return false;
        }

        public boolean cancel()
        {
           if(this.reserved) {
        this.reserved = false;
               System.out.println("Reservation " + getSeatNumber() + " cancelled");
               return true;
           }
           else
               return false;
        }
    }
}
