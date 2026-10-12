package LinerBinaryStringConcepts;

public class CompareStringBuilderAndStringBuffer {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        long sb_start_time, sb_end_time;

        sb_start_time = System.nanoTime();
        for(int i=0;i<1000000;i++){
            sb.append("hello");
        }
        sb_end_time = System.nanoTime();

        long sbf_start_time,sbf_end_time;

        sbf_start_time = System.nanoTime();
        for(int i=0;i<1000000;i++){
            sbf.append("hello");
        }
        sbf_end_time = System.nanoTime();

        System.out.println("Time for String builder: "+(sb_end_time-sb_start_time));
        System.out.println("Time for String buffer: "+(sbf_end_time-sbf_start_time));
    }
}
