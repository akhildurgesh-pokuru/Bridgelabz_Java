
/*
 * This program groups employees according to their departments.
 * It uses a HashMap to store department names and lists of employee names.
 */

package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Person {
    String name;
    String department;

    // Initializes a person's name and department.
    Person(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

// Employees inherits the name and department details from Person.
class Employees extends Person {
    Employees(String name, String department) {
        super(name, department);
    }
}

public class GroupObjects {
    public static void main(String[] args) {

        // Creates employee objects with their names and departments.
        Employees employ1 = new Employees("akhil", "HR");
        Employees employ2 = new Employees("charan", "HR");
        Employees employ3 = new Employees("Vishruth", "AI");
        Employees employ4 = new Employees("Lasya", "IT");

        // Maps each department to a list of employee names.
        HashMap<String, List<String>> map = new HashMap<>();

        // Creates a list for a department if needed, then adds the employee's name.
        map.computeIfAbsent("HR", k -> new ArrayList<>()).add(employ1.name);
        map.computeIfAbsent("HR", k -> new ArrayList<>()).add(employ2.name);
        map.computeIfAbsent("AI", k -> new ArrayList<>()).add(employ3.name);
        map.computeIfAbsent("IT", k -> new ArrayList<>()).add(employ4.name);

        // Displays the employees grouped by department.
        System.out.println(map);
    }
}
