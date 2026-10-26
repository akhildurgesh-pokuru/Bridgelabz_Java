
/*
 * This program demonstrates storing and displaying doctor details using a Set.
 * It uses LinkedHashSet to maintain insertion order and Comparable to compare doctors by ID.
 */

import com.sun.source.tree.Tree;

import java.util.*;

// Represents a doctor and defines how doctors are compared by their IDs.
class Doctor implements Comparable<Doctor> {
    int id;
    String doctor_name;

    Doctor(int id, String doctor_name) {
        this.id = id;
        this.doctor_name = doctor_name;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + doctor_name);
    }

    // Compare doctors based on their IDs.
    public int compareTo(Doctor d) {
        return Integer.compare(this.id, d.id);
    }
}

// Stores doctors and provides methods to add and display them.
class DoctorList {
    Set<Doctor> doctors;

    DoctorList() {
        doctors = new LinkedHashSet<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Iterate through the set and display each doctor's details.
    public void displayDoctors() {
        Iterator<Doctor> doctor = doctors.iterator();

        while (doctor.hasNext()) {
            Doctor d = doctor.next();
            d.displayDetails();
            System.out.println();
        }

    }

}

class Operations {
    public static void main(String[] args) {
        // Create doctor objects with their IDs and names.
        Doctor doctor = new Doctor(121, "Akhil");
        Doctor doctor1 = new Doctor(121, "Charan");
        Doctor doctor2 = new Doctor(122, "Lasya");

        // Add the doctors to the collection and display them.
        DoctorList list = new DoctorList();
        list.addDoctor(doctor);
        list.addDoctor(doctor1);
        list.addDoctor(doctor2);

        list.displayDoctors();
    }
}
