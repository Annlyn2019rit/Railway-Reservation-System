package trainTicketReservation;
import java.lang.*;

//Cancelling a ticket-Thread

public class CancelThread {
     private Cancellation cancellation;
     private String PassengerName;
     private int trainno;
     private String status;

     public CancelThread(Cancellation cancellation, String PassengerName, int trainno, String status){
          this.cancellation = cancellation;
          this.PassengerName = PassengerName;
          this.trainno = trainno;
          this.status = status;
     }

     public void start() {
               cancellation.cancelTickets(PassengerName,trainno,status);
     }
}
