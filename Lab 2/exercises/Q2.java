// Write a Java program to find the largest of three numbers using a conditional operator.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
        System.out.print("\nPlease enter num 1: ");
        double check1 = data.nextDouble();
        System.out.print("Please enter num 2: ");
        double check2 = data.nextDouble();
        System.out.print("Please enter num 3: ");
        double check3 = data.nextDouble();

        double largest;
        largest = (check1 > check2) ? ((check1 > check3) ? check1 : check3) : ((check2 > check3) ? check2 : check3);
        System.out.println("\nThe largest num is: " + largest);

        // double largest1, largest2;
        // largest1 = (check1 > check2) ? check1 : check2;
        // largest2 = (largest1 > check3) ? largest1 : check3;
        // System.out.println("The largest num is: " + largest2);
        // System.out.println();

        System.out.println();


        data.close();
    }
    
}
