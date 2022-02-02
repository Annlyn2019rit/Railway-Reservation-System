package trainTicketReservation;

//Details of Trains-Thread

public class DetailsThread {
        private Details detail;
        private int trainno;


        public DetailsThread(Details details, int trainno) {
                this.detail = details;
                this.trainno = trainno;
        }

        public void run(){
                Details.details(trainno);
        }

}
