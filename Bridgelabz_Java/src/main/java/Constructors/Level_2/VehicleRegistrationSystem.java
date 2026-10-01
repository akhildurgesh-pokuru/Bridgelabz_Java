/*
 * This program demonstrates how a static variable can be used
 * to store a common registration fee for all vehicles.
 * Each vehicle object has its own owner name and vehicle type,
 * while the registration fee is shared by all objects.
 * The program first displays the details using the initial fee
 * and then updates the fee to show how the change affects both vehicles.
 */

package Constructors.Level_2;

class registration {
    String owner_name;
    String vehicle_type;
    static int registration_fee = 500;

    // Constructor used to initialize the owner's name and vehicle type.
    registration(String owner_name, String vehicle_type) {
        this.owner_name = owner_name;
        this.vehicle_type = vehicle_type;
    }

    // Displays the vehicle registration details along with the common fee.
    public void displayVehicleDetails() {
        System.out.println("Registration Details");
        System.out.println("Owner Name: " + owner_name);
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Registration Fee: " + registration_fee);
    }

    // Updates the registration fee shared by all vehicle objects.
    public static void updateRegistrationFee(int registration_fee) {
        registration.registration_fee = registration_fee;
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {

        // Creating two vehicle registration objects with different details.
        registration obj = new registration("Sreenu", "Pulsar150");
        registration obj1 = new registration("Venky", "Royal Enfield");

        // Displaying the registration details before changing the fee.
        obj.displayVehicleDetails();
        System.out.println();

        obj1.displayVehicleDetails();
        System.out.println();

        // Updating the shared registration fee.
        registration.registration_fee = 600;

        System.out.println("Results After Updating Registration Fee");

        // Displaying both vehicles again to show the updated fee.
        obj.displayVehicleDetails();
        System.out.println();

        obj1.displayVehicleDetails();
    }
}