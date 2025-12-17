// Write a Java program to accept a point (x,y) and find whether it lies on
// the circle or inside the circle or outside the circle. The center of the circle is
// (0, 0) and the radius of the circle is 5. Equation of a circle with (0,0) as the
// center and r as the radius is given by x^2 + y^2 = r^2.
// 1. If x^2 + y^2 < r^2, then the point (x,y) lies within the circle.
// 2. If x^2 + y^2 > r^2, then the point (x,y) lies outside the circle.
// 3. If x^2 + y^2 = r^2, then the point (x,y) lies on the circle

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");
        
        double r = 5;
        double x, y;

        System.out.println("\nEnter the value of x and y coordinates: ");
        Scanner value = new Scanner(System.in);
        x = value.nextDouble();
        y = value.nextDouble();
        double eq = (x * x) + (y * y);
        if (eq < r*r) {
            System.out.println("\nThe point (" + x + ", " + y + ") lies inside the circle.");
        }
        else if (eq == r*r) {
            System.out.println("\nThe point (" + x + ", " + y + ") lies on the circle.");
        }
        else {
            System.out.println("\nThe point (" + x + ", " + y + ") lies outside the circle.");
        }
        System.out.println();
        value.close();
    }
    
}