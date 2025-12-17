// Write a Java program to print a table of values of the function y = e^−x
// for x varying from 0 to 1 in steps of 0.1. The table appears as follows.

import java.lang.Math;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");

        System.out.println("\nOur f(x) = e^-x\n");
     
        for (double i = 0; i <= 1; i += 0.1) {
            System.out.printf("For y = %.1f, f(x) = ", i);
            double y = Math.exp(-i);
            System.out.printf("%.4f\n", y);
        }
        System.out.println();

    }
}