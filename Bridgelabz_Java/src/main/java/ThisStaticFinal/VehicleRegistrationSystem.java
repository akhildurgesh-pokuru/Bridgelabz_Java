/*
 * Program to demonstrate a Vehicle Registration System
 * using static, final, this, and static method concepts in Java.
 */

package ThisStaticFinal;

class registration {
    // Static registration fee is shared by all registration objects.
    static int registration_fee = 500;

    // final registration number cannot be changed after initialization.
    final int registration_number;

    String owner_name;
    String vehicle_type;

    registration(int registration_number, String owner_name, String vehicle_type) {
        // Initialize registration details using the current object.
        this.registration_number = registration_number;
        this.owner_name = owner_name;
        this.vehicle_type = vehicle_type;
    }

    // Static method is used to modify the common registration fee.
    public static void modify_registration_fee(int fee) {
        registration.registration_fee = fee;
    }

    // Display the details of a particular vehicle registration.
    public void vehicle_details() {
        System.out.println("Registration number: " + registration_number);
        System.out.println("Owner Name: " + owner_name);
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Registration fee: " + registration_fee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {

        // Create two vehicle registration objects.
        registration obj = new registration(1223, "sreenu", "pulsar");
        registration obj1 = new registration(1442, "venkatesh", "honda");

        // Display details of the first vehicle.
        obj.vehicle_details();
        System.out.println();

        // Display details of the second vehicle.
        obj1.vehicle_details();
        System.out.println();

        // Change the common registration fee from 500 to 700.
        registration.modify_registration_fee(700);

        // Create a new registration object with the updated fee.
        registration obj2 = new registration(5243, "charan", "duo");

        System.out.println();

        // Display details of the newly registered vehicle.
        obj2.vehicle_details();

        if(obj instanceof registration){
            System.out.println("yeah! obj is instance of registration");
        }
    }
}