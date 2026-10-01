/*
 * Program to demonstrate a Hospital Management System
 * using final, static, this, constructor, and object concepts in Java.
 */

package ThisStaticFinal;

class hospital {
    // final patient ID cannot be changed after initialization.
    final int patient_id;

    // Static variable keeps track of the total number of patients.
    static int total_patients;

    // Static variable is shared by all hospital objects.
    static String hospital_name = "Akhil's hospital";

    String patient_name;
    int patient_age;
    String disease;

    hospital(int patient_id, String patient_name, int patient_age, String disease) {
        // Initialize patient details using the current object.
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.disease = disease;

        // Increase the total patient count whenever a new patient is created.
        total_patients++;
    }

    // Static method displays the total number of patients.
    public static void total_patients() {
        System.out.println("Total Patients: " + total_patients);
    }

    // Display the details of a particular patient.
    public void patient_details() {
        System.out.println("Hospital Name: " + hospital_name);
        System.out.println("patient ID: " + patient_id);
        System.out.println("Patient Name: " + patient_name);
        System.out.println("Patient Age: " + patient_age);
        System.out.println("Patient Disease: " + disease);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {

        // Create two hospital patient objects.
        hospital obj = new hospital(10432, "srrenu", 40, "back pain");
        hospital obj1 = new hospital(43123, "subbaiah", 70, "leg pain");

        System.out.println();

        // Display details of the first patient.
        obj.patient_details();
        System.out.println();

        // Display details of the second patient.
        obj1.patient_details();

        System.out.println();

        // Call the static method using the class name.
        hospital.total_patients();

        if(obj instanceof hospital){
            System.out.println("yes! obj is instance of hospital");
        }
    }
}