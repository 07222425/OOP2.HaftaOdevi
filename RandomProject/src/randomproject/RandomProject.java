package randomproject;

import java.util.Random;

public class RandomProject {

    public static void main(String[] args) {
Random random = new Random(1000);

        System.out.println("First 50 random integers (0-100): ");
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100)+" ");
            
        }
    }
}
