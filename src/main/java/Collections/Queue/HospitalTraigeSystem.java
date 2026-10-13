package Collections.Queue;

import java.util.PriorityQueue;

class Patients{
    String name;
    int emergency_number;

    Patients(String name, int emergency_number){
        this.name = name;
        this.emergency_number = emergency_number;
    }
}

public class HospitalTraigeSystem {
    public static void main(String[] args){

        PriorityQueue<Patients> patient = new PriorityQueue<>((a,b)-> Integer.compare(a.emergency_number,b.emergency_number));
        patient.offer(new Patients("akhil",1));
        patient.offer(new Patients("charan",3));
        patient.offer(new Patients("priya",2));

        while(!patient.isEmpty()){
            System.out.println(patient.poll().name);
        }
    }
}
