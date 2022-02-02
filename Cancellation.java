package trainTicketReservation;
import java.util.*;

//Canceling a Ticket

public class Cancellation {
    public synchronized void cancelTickets(String pname,int trainno, String status) {
        Scanner sc = new Scanner(System.in);

        try{
            if(status == "True"){
                System.out.println("Do you really want to cancel your ticket?(y/n)");
                char ch = sc.next().charAt(0);
                if(ch == 'y'){

                    System.out.println("Your Ticket for "+trainno+" is cancelled successfully");
                }
                else if(ch == 'n'){
                    System.out.println("Your Ticket is still valid!!\nBon Voyage");
                }
                else{
                    System.out.println("Enter the correct option (y/n)!!");
                }
            }
            else if(status == "False"){
               throw new Exception();
            }
        }

        catch(Exception x){
            System.out.println("Problem occured... We don't reach your booking");
        }
    }
}
