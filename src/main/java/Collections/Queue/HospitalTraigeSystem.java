
/*
 * This program simulates a hospital triage system that prioritizes patients by emergency number.
 * It uses a PriorityQueue to treat patients with lower emergency numbers first.
 */

package Collections.Queue;

import java.util.PriorityQueue;

class Patients {
    String name;
    int emergency_number;

    // Initializes a patient with their name and emergency number.
    Patients(String name, int emergency_number) {
        this.name = name;
        this.emergency_number = emergency_number;
    }
}

public class HospitalTraigeSystem {
    public static void main(String[] args) {

        // Creates a priority queue that orders patients by emergency number in ascending order.
        PriorityQueue<Patients> patient = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.emergency_number, b.emergency_number));

        // Adds patients with their respective emergency numbers.
        patient.offer(new Patients("akhil", 1));
        patient.offer(new Patients("charan", 3));
        patient.offer(new Patients("priya", 2));

        // Removes and prints patients in priority order until the queue is empty.
        while (!patient.isEmpty()) {
            System.out.println(patient.poll().name);
        }
    }
}
