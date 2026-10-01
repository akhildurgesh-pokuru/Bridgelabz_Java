 /*
  * This program demonstrates three types of constructors in Java:
  * a default constructor, a parameterized constructor, and a copy constructor.
  * The default constructor creates a booking with predefined details.
  * The parameterized constructor creates a booking using details entered by the user.
  * The copy constructor creates a new booking by copying the details of another booking.
  */

 package Constructors.Level_1;

 import java.util.Scanner;

 class booking {
     private String name;
     private String room_type;
     private int nights;

     // Default constructor that assigns predefined booking details.
     booking() {
         name = "akhil";
         room_type = "non AC";
         nights = 2;
     }

     // Parameterized constructor that stores the booking details provided by the user.
     booking(String name, String room_type, int nights) {
         this.name = name;
         this.room_type = room_type;
         this.nights = nights;
     }

     // Copy constructor that creates a new booking using another booking object's details.
     booking(booking obj1) {
         this.name = obj1.name;
         this.room_type = obj1.room_type;
         this.nights = obj1.nights;
     }

     // Displays the guest and room booking details.
     public void person_details() {
         System.out.println("Guest name: " + name);
         System.out.println("Room Type: " + room_type);
         System.out.println("Number of shifts: " + nights);
     }
 }

 public class HotelBookingSystem {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         // Creating the first booking using the default constructor.
         booking obj = new booking();
         System.out.println("Below details are default person details");
         obj.person_details();

         // Taking the guest's booking details from the user.
         System.out.println("Enter the guest name");
         String name = sc.next();

         sc.nextLine();

         System.out.println("Enter the room type");
         String room_type = sc.nextLine();

         System.out.println("Enter the number of nights does guest stay");
         int nights = sc.nextInt();

         // Creating a booking using the parameterized constructor.
         booking obj1 = new booking(name, room_type, nights);
         System.out.println("Below details are from parameterized constructor");
         obj1.person_details();

         // Creating another booking by copying the details of the parameterized object.
         booking obj2 = new booking(obj1);
         System.out.println("Blow details are from copy constructor");
         obj2.person_details();
     }
 }