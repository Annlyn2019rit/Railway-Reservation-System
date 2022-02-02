package com;

//Train Ticket Reservstion

import trainTicketReservation.*;
import java.util.*;
import java.lang.*;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("1. Book your Ticket\n2. Cancel your Ticket\n3. View Details");
        System.out.println("Pick your choice");
        int ch;
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the number of Seats you needed ");
                int reqnoofSeats = sc.nextInt();
                TicketCounter ticketCounter = new TicketCounter();
                BookingThread t1 = new BookingThread(ticketCounter, name, reqnoofSeats, "Manhattan", "Boston");

                t1.start();
                break;

            case 2:
                System.out.println("Enter the train number");
                int trainno = sc.nextInt();

                Cancellation cancelTickets = new Cancellation();
                CancelThread t2 = new CancelThread(cancelTickets, name, trainno, "True");

                t2.start();
                break;

            case 3:
                System.out.println("Enter the train number");
                int trainNo  = sc.nextInt();

                Details details = new Details();
                DetailsThread t3 = new DetailsThread(details, trainNo);

                t3.run();
                break;
        }
    }
}

