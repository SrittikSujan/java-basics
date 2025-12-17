// Write a Java program to generate a Fibonacci series.

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        Scanner count = new Scanner(System.in);
        System.out.print("\nEnter the number of terms for Fibonacci series: ");
        int terms = count.nextInt();

        System.out.print("\nFibonacci Series: " + n1 + " " + n2);
        while (terms > 2) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            terms--;
        }
        System.out.println("\n");

        count.close();
    }
}
