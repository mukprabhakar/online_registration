import java.util.Scanner;
 class OnlineReservationSystem {
    private static boolean[] seat = new boolean[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){

            // All display item
            System.out.println("\nYou can select any one Option of them:");
            System.out.println("1. View available Seat :");
            System.out.println("2. You want to Reserved a Seat:");
            System.out.println("3. Cancel Your Reservation:");
            System.out.println("4. Exit");

            // for user input
            int n = sc.nextInt();
            switch(n){

                case 1:
                    viewAvailableSeat();
                    break;
                case 2:
                    viewReserveSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("You Entered Invalid Input!");
                    break;
            }
        }
    }

    private static void cancelReservation(){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Seat number Which you want to canceled:");
        int Sn= sc.nextInt();
        if(Sn < 1 || Sn>20){
            System.out.println("You enter Invalid Seat Number:");
        } else if (!seat[Sn-1]) {
            System.out.println("Here seat is not Reserved!");
        } else {
            seat[Sn-1] = false;
            System.out.println("Your Reservation have been canceled!");
        }
    }

    private static void viewReserveSeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter seat number from 1 to 20:");
        int Sn= sc.nextInt();
        if(Sn < 1 || Sn > 20){
            System.out.println("You Entered Invalid Seat Number:");
        } else if (seat[Sn -1]) {
            System.out.println("Entered Seat already reserved! ");
        } else{
            seat[Sn-1]= true;
            System.out.println("Seat Reserved!");
        }
    }

    private static void viewAvailableSeat(){
        System.out.println("\nSeat Available At Current Time:");
        for(int i=0;i<seat.length;i++){
            if(seat[i]) {
                System.out.print("* "); // print * symbol which seat is seat reserved
            }
            else {
                System.out.print((i+1)+" ");
            }
        }
        System.out.println();
    }
}