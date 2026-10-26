
/*
 * This program demonstrates storing and displaying doctor details using a Map.
 * It uses a TreeMap to store doctor IDs and names in sorted order by ID.
 */

import java.util.*;

// Represents a doctor with an ID and name.
class doctor {
    int id;
    String name;

    doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
    }

}

// Manages the collection of doctors using a Map.
class doctors_list {
    Map<Integer, String> map;

    doctors_list() {
        map = new TreeMap<>();
    }

    // Add a doctor using the ID as the key and the name as the value.
    public void addDoctor(Integer id, String name) {
        map.put(id, name);
    }

    // Display all doctor IDs and their corresponding names.
    public void displayDetails() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

public class MapOperations {
    public static void main(String[] args) {
        // Create the doctor list, add a doctor, and display the stored details.
        doctors_list doctor = new doctors_list();
        doctor.addDoctor(121, "akhil");

        doctor.displayDetails();
    }
}
