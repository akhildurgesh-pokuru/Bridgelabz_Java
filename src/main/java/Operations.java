
import com.sun.source.tree.Tree;

import java.util.*;

class Doctor implements Comparable<Doctor>{
    int id;
    String doctor_name;

    Doctor(int id, String doctor_name){
        this.id = id;
        this.doctor_name = doctor_name;
    }

    public void displayDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+doctor_name);
    }


    public int compareTo(Doctor d){
        return Integer.compare(this.id, d.id);
    }
}

class DoctorList{
    Set<Doctor> doctors;
    DoctorList(){
        doctors = new LinkedHashSet<>();
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void displayDoctors(){
        Iterator<Doctor> doctor = doctors.iterator();

        while(doctor.hasNext()){
            Doctor d = doctor.next();
            d.displayDetails();
            System.out.println();
        }

    }

}


class Operations {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(121, "Akhil");
        Doctor doctor1 = new Doctor(121, "Charan");
        Doctor doctor2 = new Doctor(122,"Lasya");

        DoctorList list = new DoctorList();
        list.addDoctor(doctor);
        list.addDoctor(doctor1);
        list.addDoctor(doctor2);

        list.displayDoctors();
    }
}