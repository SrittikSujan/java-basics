// Write a Java program to accept the length and breadth of a rectangle and display its area and perimeter.

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-------------------------------\n");

        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle: ");
        double length = value.nextDouble();
        System.out.print("Please enter the breadth of the rectangle: ");
        double breadth = value.nextDouble();

        System.out.println("\n-------------------------------\n");

        double perimeter = 2 * ( length + breadth);
        double area = length * breadth;

        System.out.printf("The perimeter of the rectangle is %.2f%n", perimeter);
        System.out.printf("The area of the rectangle is %.2f%n%n", area);

        value.close();
    }
}