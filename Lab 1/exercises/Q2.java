// Write a Java program to find the area and circumference of a circle, given its radius, r.

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-------------------------------\n");

        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the radius: ");
        double radius = value.nextDouble();

        System.out.println("\n-------------------------------\n");

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.println();

        value.close();
    }
}