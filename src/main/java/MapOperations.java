import java.util.*;

class doctor{
    int id;
    String name;

    doctor(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void displayDetails(){
        System.out.println("id: "+id);
        System.out.println("Name: "+name);
    }

}

class doctors_list{
    Map<Integer, String> map;
    doctors_list(){
        map = new TreeMap<>();
    }

    public void addDoctor(Integer id, String name){
        map.put(id, name);
    }

    public void displayDetails(){
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}


public class MapOperations {
    public static void main(String[] args){
        doctors_list doctor = new doctors_list();
        doctor.addDoctor(121,"akhil");

        doctor.displayDetails();
    }
}
