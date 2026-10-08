package dateproject;

import java.util.Date;

public class DateProject {

    public static void main(String[] args) {
        long[] times = {10000,100000,1000000,10000000,100000000,1000000000,1000000000L,10000000000L};
        
        for (long time : times) {
            Date date = new Date(time);
            System.out.println("Elapsed Time: " + time + " -> " + date.toString());
            
        }
    }
    
}
