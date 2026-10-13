package LinkedList.Circular;

/*
This program manages movie ticket reservations using a circular linked list.
It supports booking and cancelling tickets, searching reservations, displaying tickets, and counting bookings.
*/

public class TicketReservation {

    static class Node {
        int ticketId;
        String customer, movie, seat, bookingTime;
        Node next;

        Node(int ticketId, String customer, String movie,
             String seat, String bookingTime) {
            this.ticketId = ticketId;
            this.customer = customer;
            this.movie = movie;
            this.seat = seat;
            this.bookingTime = bookingTime;
        }
    }

    Node head, tail;
    int count = 0;

    // Add a new reservation at the end of the circular list.
    void bookTicket(int id, String customer, String movie,
                    String seat, String bookingTime) {
        Node n = new Node(id, customer, movie, seat, bookingTime);

        if (head == null) {
            head = tail = n;
            n.next = head;
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;
        }

        count++;
        System.out.println("Ticket booked successfully");
    }

    // Cancel a reservation using its ticket ID.
    void cancelTicket(int id) {
        if (head == null) {
            System.out.println("No reservations available");
            return;
        }

        Node c = head;
        Node prev = tail;

        do {
            if (c.ticketId == id) {
                // Handle the only reservation in the list.
                if (head == tail) {
                    head = tail = null;
                } else {
                    prev.next = c.next;

                    if (c == head)
                        head = c.next;

                    if (c == tail)
                        tail = prev;

                    // Keep the last node connected to the head.
                    tail.next = head;
                }

                count--;
                System.out.println("Ticket cancelled");
                return;
            }

            prev = c;
            c = c.next;
        } while (c != head);

        System.out.println("Ticket not found");
    }

    // Print one reservation.
    void show(Node n) {
        System.out.println("Ticket ID: " + n.ticketId
                + ", Customer: " + n.customer
                + ", Movie: " + n.movie
                + ", Seat: " + n.seat
                + ", Booking Time: " + n.bookingTime);
    }

    // Display every reservation exactly once.
    void displayTickets() {
        if (head == null) {
            System.out.println("No reservations available");
            return;
        }

        Node c = head;

        do {
            show(c);
            c = c.next;
        } while (c != head);
    }

    // Search reservations by customer name or movie title.
    void search(String key) {
        if (head == null) {
            System.out.println("No reservations available");
            return;
        }

        Node c = head;
        boolean found = false;

        do {
            if (c.customer.equalsIgnoreCase(key)
                    || c.movie.equalsIgnoreCase(key)) {
                show(c);
                found = true;
            }

            c = c.next;
        } while (c != head);

        if (!found)
            System.out.println("Reservation not found");
    }

    // Return the number of active reservations.
    int countTickets() {
        return count;
    }

    public static void main(String[] args) {
        TicketReservation tr = new TicketReservation();

        tr.bookTicket(101, "Akhil", "Avengers", "A1", "10:00 AM");
        tr.bookTicket(102, "Ravi", "Spider-Man", "B2", "10:15 AM");
        tr.bookTicket(103, "Priya", "Avengers", "A2", "10:30 AM");

        System.out.println("\nAll Reservations:");
        tr.displayTickets();

        System.out.println("\nSearch by Movie:");
        tr.search("Avengers");

        tr.cancelTicket(102);

        System.out.println("\nReservations After Cancellation:");
        tr.displayTickets();

        System.out.println("Total Tickets: " + tr.countTickets());
    }
}
