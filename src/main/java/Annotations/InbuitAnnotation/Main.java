package Annotations.InbuitAnnotation;

/*
Below Code Demonstrates the
Injecting of In Built Annotation - Over Ride
 */

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    // Indicates that this method overrides the parent class method
    @Override
    void work() {
        System.out.println("Developer is writing code");
    }
}

public class Main {
    public static void main(String[] args) {

        Developer d = new Developer();
        d.work();
    }
}
