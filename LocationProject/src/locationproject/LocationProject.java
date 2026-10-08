package locationproject;

import java.util.Scanner;

public class LocationProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        
        double[][] array = new double[rows][cols];
        System.out.println("Enter the array values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
            
        }
        
        Location location = Location.locateLargest(array);
        
        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ") " );
    }   
}
