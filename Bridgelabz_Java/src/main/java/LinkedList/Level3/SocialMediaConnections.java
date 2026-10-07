/*
 * This program manages social media users and their friend connections using a singly linked list.
 * It supports adding users, connecting friends, removing connections, searching users, and finding mutual friends.
 */

package LinkedList.Level3;

import java.util.ArrayList;
import java.util.List;

// Node class representing a social media user
class SocialMedia {

    String user_id;
    String name;
    int age;

    // Stores the user IDs of the user's friends
    List<String> friends;

    // Points to the next user in the linked list
    SocialMedia next;

    // Constructor to initialize user details
    SocialMedia(String user_id, String name, int age, List<String> friends) {
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.friends = friends;

        // Initially, the next user is null
        this.next = null;
    }
}

// Class containing operations for managing social media connections
class SocialConnections {

    // Head points to the first user in the linked list
    // Current is used for traversing the linked list
    SocialMedia head = null, current = null;

    // Adds a new user to the linked list
    public void addUser(String user_id, String name, int age, List<String> friends) {

        // Create a new user node
        SocialMedia user1 = new SocialMedia(user_id, name, age, friends);

        // If the list is empty, make the new user the head
        if (head == null) {
            head = current = user1;
            return;
        }

        // Start traversal from the first user
        current = head;

        // Move to the last user in the linked list
        while (current.next != null) {
            current = current.next;
        }

        // Connect the new user at the end of the list
        current.next = user1;
    }

    // Creates a two-way friendship connection between two users
    public void addFriendConnection(String user1, String user2) {

        // Start searching for the first user
        SocialMedia current1 = head;

        // Traverse the linked list to find user1
        while (current1 != null) {
            if (current1.user_id.equals(user1)) {
                break;
            } else {
                current1 = current1.next;
            }
        }

        // Start searching for the second user
        SocialMedia current2 = head;

        // Traverse the linked list to find user2
        while (current2.next != null) {
            if (current2.user_id.equals(user2)) {
                break;
            } else {
                current2 = current2.next;
            }
        }

        // Add user2 to user1's friend list if not already present
        if (!current1.friends.contains(user2)) {
            current1.friends.add(user2);
        }

        // Add user1 to user2's friend list if not already present
        if (!current2.friends.contains(user1)) {
            current2.friends.add(user1);
        }
    }

    // Removes the friendship connection between two users
    public void removeFriendConnection(String user1, String user2) {

        // Start searching for the first user
        SocialMedia current1 = head;

        // Find user1 in the linked list
        while (current1.next != null) {
            if (current1.user_id.equals(user1)) {
                break;
            } else {
                current1 = current1.next;
            }
        }

        // Start searching for the second user
        SocialMedia current2 = head;

        // Find user2 in the linked list
        while (current2.next != null) {
            if (current2.user_id.equals(user2)) {
                break;
            } else {
                current2 = current2.next;
            }
        }

        // Remove user2 from user1's friend list
        current1.friends.remove(user2);

        // Remove user1 from user2's friend list
        current2.friends.remove(user1);
    }

    // Finds common friends between two users
    public void mutualFriends(String user1, String user2) {

        // Start searching for the first user
        SocialMedia current1 = head;

        // Find user1 in the linked list
        while (current1.next != null) {
            if (current1.user_id.equals(user1)) {
                break;
            } else {
                current1 = current1.next;
            }
        }

        // Start searching for the second user
        SocialMedia current2 = head;

        // Find user2 in the linked list
        while (current2.next != null) {
            if (current2.user_id.equals(user2)) {
                break;
            } else {
                current2 = current2.next;
            }
        }

        // Compare every friend of user1 with every friend of user2
        for (String friend1 : current1.friends) {

            // Check the current friend against all friends of user2
            for (String friend2 : current2.friends) {

                // If both users have the same friend, print the mutual friend
                if (friend1.equals(friend2)) {
                    System.out.print(friend1 + " ");
                }
            }
        }
    }

    // Displays all friends of a particular user
    public void displayAllFriends(String user) {

        // Start searching from the first user
        current = head;

        // Traverse the linked list to find the required user
        while (current.next != null) {
            if (current.user_id.equals(user)) {
                break;
            } else {
                current = current.next;
            }
        }

        // Display all friends of the selected user
        for (String friend : current.friends) {
            System.out.print(friend + " ");
        }
    }

    // Searches for a user using the user ID
    public void searchUser(String user) {

        // Start searching from the head
        current = head;

        // Traverse the linked list until the user is found
        while (current != null) {

            // Check whether the current user ID matches
            if (current.user_id.equals(user)) {
                break;
            }

            // Move to the next user
            current = current.next;
        }

        // Display the user's details
        System.out.println("user_id: " + current.user_id);
        System.out.println("Name: " + current.name);
        System.out.println("Age: " + current.age);

        // Display the user's friends
        System.out.println("Friends: ");

        // Traverse the friend list and print each friend
        for (String friend : current.friends) {
            System.out.print(friend + " ");
        }
    }

    // Displays every user's ID and their friends
    public void numberOfFriends() {

        // Start traversal from the first user
        current = head;

        // Continue until the end of the linked list
        while (current != null) {

            // Display the current user's ID
            System.out.println("User ID: " + current.user_id);

            // Display all friends of the current user
            for (String friend : current.friends) {
                System.out.print(friend + " ");
            }

            System.out.println();

            // Move to the next user
            current = current.next;
        }
    }
}

// Main class for the social media connection program
public class SocialMediaConnections {

    public static void main(String[] args) {

        // Create an object to manage social media connections
        SocialConnections connections = new SocialConnections();

        // Add the first user with an initial list of friends
        connections.addUser(
                "akhil_smart_boy_",
                "Akhil Durgesh",
                20,
                new ArrayList<>(List.of(
                        "always_krishna_charan",
                        "sai_likhitha"
                ))
        );

        // Add the second user with an initial list of friends
        connections.addUser(
                "vishruth_18",
                "vishruth",
                15,
                new ArrayList<>(List.of(
                        "ashad",
                        "ramya",
                        "always_krishna_charan"
                ))
        );

        // Create a friendship connection between the two users
        connections.addFriendConnection(
                "akhil_smart_boy_",
                "vishruth_18"
        );

        // Display all friends of Vishruth
        connections.displayAllFriends("vishruth_18");
        System.out.println();

        // Find and display mutual friends between Akhil and Vishruth
        connections.mutualFriends(
                "akhil_smart_boy_",
                "vishruth_18"
        );
        System.out.println();

        // Search and display Vishruth's details
        connections.searchUser("vishruth_18");
        System.out.println();

        // Display all friends of Akhil
        connections.displayAllFriends("akhil_smart_boy_");
        System.out.println();

        // Display all users and their friends
        connections.numberOfFriends();
    }
}