/*
 * This program manages online movie ticket reservations using a circular linked list.
 * It supports adding, removing, searching, displaying, and counting booked tickets.
 */

package LinkedList.Level3;

// Node class representing one ticket reservation
class Ticket {

    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;

    // Points to the next ticket in the circular linked list
    Ticket next;

    // Constructor to initialize ticket details
    Ticket(int ticketId, String customerName, String movieName,
           int seatNumber, String bookingTime) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;

        // Initially, the next ticket is null
        this.next = null;
    }
}

// Class containing all ticket reservation operations
class TicketReservation {

    // Head points to the first ticket in the circular list
    Ticket head = null;

    // Current is used for traversing the list
    Ticket current = null;

    // Stores the total number of booked tickets
    int count = 0;

    // Adds a new ticket to the circular linked list
    public void addTicket(int ticketId, String customerName,
                          String movieName, int seatNumber,
                          String bookingTime) {

        // Create a new ticket node
        Ticket ticket = new Ticket(
                ticketId,
                customerName,
                movieName,
                seatNumber,
                bookingTime
        );

        // If the list is empty, make the new ticket the head
        if (head == null) {
            head = ticket;

            // Point the ticket back to itself to maintain circular structure
            ticket.next = head;

            // Increase the ticket count
            count++;
            return;
        }

        // Start traversal from the first ticket
        current = head;

        // Move to the last ticket in the circular list
        while (current.next != head) {
            current = current.next;
        }

        // Connect the last ticket to the new ticket
        current.next = ticket;

        // Connect the new ticket back to the head
        ticket.next = head;

        // Increase the total ticket count
        count++;
    }

    // Removes a ticket using its ticket ID
    public void removeTicket(int ticketId) {

        // Check whether the list is empty
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        // Start checking from the head
        current = head;

        // Check if the ticket to remove is the first ticket
        if (head.ticketId == ticketId) {

            // If there is only one ticket, make the list empty
            if (head.next == head) {
                head = null;
                count--;
                return;
            }

            // Find the last ticket in the circular list
            while (current.next != head) {
                current = current.next;
            }

            // Move the head to the next ticket
            head = head.next;

            // Connect the last ticket to the new head
            current.next = head;

            // Decrease the ticket count
            count--;
            return;
        }

        // Previous stores the ticket before the current ticket
        Ticket previous = head;

        // Start searching from the second ticket
        current = head.next;

        // Search for the ticket with the given ID
        while (current != head && current.ticketId != ticketId) {

            // Move previous to the current ticket
            previous = current;

            // Move current to the next ticket
            current = current.next;
        }

        // If we reached head, the ticket was not found
        if (current == head) {
            System.out.println("Ticket not found");
            return;
        }

        // Skip the ticket that needs to be removed
        previous.next = current.next;

        // Decrease the ticket count
        count--;
    }

    // Displays all booked tickets
    public void displayTickets() {

        // Check whether there are any tickets
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        // Start traversal from the head
        current = head;

        // do-while is used because the list is circular
        do {
            // Display ticket details
            System.out.println("Ticket ID: " + current.ticketId);
            System.out.println("Customer Name: " + current.customerName);
            System.out.println("Movie Name: " + current.movieName);
            System.out.println("Seat Number: " + current.seatNumber);
            System.out.println("Booking Time: " + current.bookingTime);
            System.out.println();

            // Move to the next ticket
            current = current.next;

            // Stop when we reach the head again
        } while (current != head);
    }

    // Searches for a ticket using the customer's name
    public void searchByCustomer(String customerName) {

        // Check whether the list is empty
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        // Start searching from the head
        current = head;

        // Traverse the complete circular list
        do {

            // Compare the current customer's name with the given name
            if (current.customerName.equals(customerName)) {

                // Display the matching ticket details
                System.out.println("Ticket ID: " + current.ticketId);
                System.out.println("Customer Name: " + current.customerName);
                System.out.println("Movie Name: " + current.movieName);
                System.out.println("Seat Number: " + current.seatNumber);
                System.out.println("Booking Time: " + current.bookingTime);

                // Stop searching after finding the customer
                return;
            }

            // Move to the next ticket
            current = current.next;

            // Stop when we reach the head again
        } while (current != head);

        // Display message if customer was not found
        System.out.println("Customer not found");
    }

    // Searches for all tickets booked for a particular movie
    public void searchByMovie(String movieName) {

        // Check whether the list is empty
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        // Start searching from the head
        current = head;

        // Keeps track of whether at least one ticket was found
        boolean found = false;

        // Traverse the complete circular list
        do {

            // Check whether the current ticket belongs to the given movie
            if (current.movieName.equals(movieName)) {

                // Display the matching ticket details
                System.out.println("Ticket ID: " + current.ticketId);
                System.out.println("Customer Name: " + current.customerName);
                System.out.println("Movie Name: " + current.movieName);
                System.out.println("Seat Number: " + current.seatNumber);
                System.out.println("Booking Time: " + current.bookingTime);
                System.out.println();

                // Mark that a matching ticket was found
                found = true;
            }

            // Move to the next ticket
            current = current.next;

            // Stop when we reach the head again
        } while (current != head);

        // Display message if no matching movie was found
        if (!found) {
            System.out.println("Movie not found");
        }
    }

    // Displays the total number of booked tickets
    public void totalBookedTickets() {

        // Print the current ticket count
        System.out.println("Total booked tickets: " + count);
    }
}

// Main class for the online ticket reservation system
public class OnlineTicketReservation {

    public static void main(String[] args) {

        // Create an object to perform ticket reservation operations
        TicketReservation reservation = new TicketReservation();

        // Add the first ticket
        reservation.addTicket(
                101,
                "Akhil",
                "Avatar",
                25,
                "10:30 AM"
        );

        // Add the second ticket
        reservation.addTicket(
                102,
                "Vishruth",
                "Avengers",
                18,
                "11:00 AM"
        );

        // Add the third ticket
        reservation.addTicket(
                103,
                "Sai",
                "Avatar",
                26,
                "11:30 AM"
        );

        // Add the fourth ticket
        reservation.addTicket(
                104,
                "Ramya",
                "Leo",
                12,
                "12:00 PM"
        );

        // Display all booked tickets
        reservation.displayTickets();

        // Search for a ticket using customer name
        System.out.println("Searching customer:");
        reservation.searchByCustomer("Akhil");

        // Search for all tickets booked for a movie
        System.out.println("\nSearching movie:");
        reservation.searchByMovie("Avatar");

        // Remove the ticket with ID 102
        reservation.removeTicket(102);

        // Display tickets after removing ticket 102
        System.out.println("\nAfter removing ticket 102:");
        reservation.displayTickets();

        // Display the total number of booked tickets
        reservation.totalBookedTickets();
    }
}