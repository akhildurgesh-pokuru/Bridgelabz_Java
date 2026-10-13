package LinkedList.Single;

/*
This program manages users and their friendships using a singly linked list.
It supports adding and removing friends, finding mutual friends, searching users, and counting friends.
*/

import java.util.ArrayList;

public class SocialMediaFriends {

    static class Node {
        int id, age;
        String name;
        ArrayList<Integer> friends = new ArrayList<>();
        Node next;

        Node(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    Node head;

    // Add a user to the end of the list.
    void addUser(int id, String name, int age) {
        Node n = new Node(id, name, age);

        if (head == null) {
            head = n;
            return;
        }

        Node c = head;

        while (c.next != null)
            c = c.next;

        c.next = n;
    }

    // Find a user using their ID.
    Node findUser(int id) {
        Node c = head;

        while (c != null) {
            if (c.id == id)
                return c;

            c = c.next;
        }

        return null;
    }

    // Add a friendship in both users' friend lists.
    void addFriend(int id1, int id2) {
        Node u1 = findUser(id1);
        Node u2 = findUser(id2);

        if (u1 == null || u2 == null || id1 == id2) {
            System.out.println("Invalid users");
            return;
        }

        if (!u1.friends.contains(id2)) {
            u1.friends.add(id2);
            u2.friends.add(id1);
        }
    }

    // Remove a friendship from both users.
    void removeFriend(int id1, int id2) {
        Node u1 = findUser(id1);
        Node u2 = findUser(id2);

        if (u1 != null && u2 != null) {
            u1.friends.remove(Integer.valueOf(id2));
            u2.friends.remove(Integer.valueOf(id1));
        }
    }

    // Display the friends of a user.
    void listFriends(int id) {
        Node user = findUser(id);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.println("Friends of " + user.name + ":");

        for (int friendId : user.friends) {
            Node friend = findUser(friendId);

            if (friend != null)
                System.out.println(friend.id + " - " + friend.name);
        }
    }

    // Find friends shared by both users.
    void mutualFriends(int id1, int id2) {
        Node u1 = findUser(id1);
        Node u2 = findUser(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found");
            return;
        }

        for (int friendId : u1.friends) {
            if (u2.friends.contains(friendId)) {
                Node friend = findUser(friendId);

                if (friend != null)
                    System.out.println(friend.id + " - " + friend.name);
            }
        }
    }

    // Search users by name or ID.
    void search(String key) {
        Node c = head;
        boolean found = false;

        while (c != null) {
            if (String.valueOf(c.id).equals(key)
                    || c.name.equalsIgnoreCase(key)) {
                System.out.println(c.id + " - " + c.name
                        + ", Age: " + c.age);
                found = true;
            }

            c = c.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    // Return the number of friends connected to a user.
    int countFriends(int id) {
        Node user = findUser(id);
        return user == null ? -1 : user.friends.size();
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();

        sm.addUser(1, "Akhil", 21);
        sm.addUser(2, "Ravi", 22);
        sm.addUser(3, "Priya", 21);
        sm.addUser(4, "Kiran", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.listFriends(1);

        System.out.println("Mutual Friends:");
        sm.mutualFriends(1, 2);

        System.out.println("Friend Count: " + sm.countFriends(1));

        sm.removeFriend(1, 2);

        System.out.println("Search:");
        sm.search("Priya");
    }
}
