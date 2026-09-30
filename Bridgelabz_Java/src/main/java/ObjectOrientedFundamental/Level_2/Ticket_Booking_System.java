import java.util.Scanner;

public class Ticket_Booking_System{
    public static void main(String[] args) {
    
    movieticket obj = new movieticket();
     obj.bookticket();
     obj.moviedetails();

    }
    
}

class movieticket{

    public static final Scanner sc = new Scanner(System.in);

    String movie_name;
    int seat_number;
    double price;

    public void bookticket(){
        System.out.println("Below are the list of movies available");
        System.out.println("1. Paradise");
        System.out.println("2. pushpa");
        System.out.println("3. Devara");
        System.out.println("select the movie");
        int choice = sc.nextInt();
        int amount = 0;

        switch(choice){
            case 1 : movie_name = "Paradise";
                    System.out.println("Amount to Pay: 400");
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    price = 400;
                    seat_number = (int) Math.random()*100+1;
                    break;

            case 2 : movie_name = "pushpa";
                    System.out.println("Amount to Pay: 300");
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    price = 300;
                    seat_number = (int) Math.random()*100+1;
                    break;
                    
            case 3 : movie_name = "Devara";
                    System.out.println("Amount to Pay: 400");
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    price = 400;
                    seat_number = (int) Math.random()*100+1;
                    break;

            default : System.out.println("Please select correct show");
                      break;
        }


    }

    public void moviedetails(){
        System.out.println("Dear user you have booked your ticket for movie: "+movie_name);
                    System.out.println("Your Seat number: "+seat_number);
                    System.out.println("Total Amount paid: "+price);
    }
}