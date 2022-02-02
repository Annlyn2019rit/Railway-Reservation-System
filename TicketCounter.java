package trainTicketReservation;

//Tickect Counter for booking a train ticket

public class TicketCounter {
    private int availSeats = 5;
    public synchronized void bookTickets(String pname, int noofSeats, String from, String to)  {
        try {

            if ((availSeats >= noofSeats) && (noofSeats > 0)) {
                System.out.println("Hi " + pname + ", Ticket Booked Successfully from " + from + " to " + to);
                System.out.println("Bon Voyage");
                availSeats = availSeats - noofSeats;
            } else {
                throw new RuntimeException();
            }
        }
        catch(Exception x){
            System.out.println("Dear " + pname + ", SORRY!!! Seats Unavailable from " + from + " to " + to);

        }

    }
}
