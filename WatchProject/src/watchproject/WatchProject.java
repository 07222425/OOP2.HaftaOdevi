package watchproject;

import java.util.Arrays;
public class WatchProject {
    public static void main(String[] args) {
        
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100000);
            
        }
StopWatch stopwatch = new StopWatch();
stopwatch.start();

        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1 ; j < list.length; j++) {
                if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
                }
                
              }
            if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
            }
        }
        stopwatch.stop();
        
        System.out.println("The execution time of sorting 100,000 numbers using selection sort is: " + stopwatch.getElapsedTime() + "milliseconds");
    }
    
}
