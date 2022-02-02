package trainTicketReservation;

//Details of Train

public class Details {
        public static void details(int trainno) {
                try {
                        switch(trainno){
                                case 701:
                                        System.out.println("Train Name: Red Line Express");
                                        System.out.println("Destination: Boston to Manhattan");
                                        System.out.println("Depature: 9am");
                                        System.out.println("Cost: $20");
                                        break;

                                case 702:
                                        System.out.println("Train Name: LA City Express");
                                        System.out.println("Destination: Boston to Los Angels");
                                        System.out.println("Depature: 9.30am");
                                        System.out.println("Cost: $25");
                                        break;

                                case  703:
                                        System.out.println("Train Name: Iron City Express");
                                        System.out.println("Destination: Boston to Chicago");
                                        System.out.println("Depature: 7am");
                                        System.out.println("Cost: $40");
                                        break;

                                case 704:
                                        System.out.println("Train Name: Keystone Express");
                                        System.out.println("Destination: Boston to Washington");
                                        System.out.println("Depature: 8.30am");
                                        System.out.println("Cost: $45");
                                        break;

                                case 705:
                                        System.out.println("Train Name: Meteor Express");
                                        System.out.println("Destination: Boston to Miami");
                                        System.out.println("Depature: 9.30am");
                                        System.out.println("Cost: $50");
                                        break;

                                default:
                                        throw new Exception();
                        }

                }
                catch(Exception x){
                        System.out.println("The Train no you've entered is wrong!!\nPlease Reenter ");
                }

        }
}
