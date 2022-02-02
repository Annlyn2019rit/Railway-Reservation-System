package trainTicketReservation;

//Train ticket booking-Thread

public class BookingThread extends Thread {
    private TicketCounter ticketCounter;
    private String passengername;
    private int reqnoofSeats;
    private String from;
    private String to;

    public BookingThread(TicketCounter ticketCounter, String passengername, int reqnoofSeats, String from, String to) {
        this.ticketCounter = ticketCounter;
        this.passengername = passengername;
        this.reqnoofSeats = reqnoofSeats;
        this.from = from;
        this.to = to;

    }

    public void run(){
        ticketCounter.bookTickets(passengername,reqnoofSeats,from,to);
    }
}

