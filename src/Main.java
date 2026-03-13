import java.util.Scanner;

public class TheaterSystem {

    static Scanner sc = new Scanner(System.in);

    static String[] movies = {"Leo", "Jailer", "Vikram"};

    static int[][] seats = new int[5][5];

    static int price = 150;

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== THEATER MANAGEMENT SYSTEM =====");
            System.out.println("1. View Movies");
            System.out.println("2. View Seats");
            System.out.println("3. Book Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    viewMovies();
                    break;

                case 2:
                    viewSeats();
                    break;

                case 3:
                    bookTicket();
                    break;

                case 4:
                    cancelTicket();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice != 5);

    }

    static void viewMovies(){

        System.out.println("\nAvailable Movies:");

        for(int i=0;i<movies.length;i++){
            System.out.println((i+1) + ". " + movies[i]);
        }

    }

    static void viewSeats(){

        System.out.println("\nSeat Layout (0 = Available , 1 = Booked)");

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void bookTicket(){

        System.out.print("Enter row (0-4): ");
        int row = sc.nextInt();

        System.out.print("Enter column (0-4): ");
        int col = sc.nextInt();

        if(seats[row][col] == 0){
            seats[row][col] = 1;
            System.out.println("Ticket booked successfully!");
            System.out.println("Ticket Price: ₹" + price);
        }
        else{
            System.out.println("Seat already booked!");
        }

    }

    static void cancelTicket(){

        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.print("Enter column: ");
        int col = sc.nextInt();

        if(seats[row][col] == 1){
            seats[row][col] = 0;
            System.out.println("Ticket cancelled successfully");
        }
        else{
            System.out.println("Seat already empty");
        }

    }

}
