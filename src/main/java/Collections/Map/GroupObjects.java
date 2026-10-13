package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Person{
    String name;
    String department;

    Person(String name, String department){
        this.name = name;
        this.department = department;
    }
}

class Employees extends Person{
    Employees(String name, String department){
        super(name, department);
    }
}

public class GroupObjects {
    public static void main(String[] args){
        Employees employ1 = new Employees("akhil","HR");
        Employees employ2 = new Employees("charan","HR");
        Employees employ3 = new Employees("Vishruth","AI");
        Employees employ4 = new Employees("Lasya","IT");

        HashMap<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("HR",k-> new ArrayList<>()).add(employ1.name);
        map.computeIfAbsent("HR",k-> new ArrayList<>()).add(employ2.name);
        map.computeIfAbsent("AI",k-> new ArrayList<>()).add(employ3.name);
        map.computeIfAbsent("IT",k-> new ArrayList<>()).add(employ4.name);

        System.out.println(map);
    }
}
