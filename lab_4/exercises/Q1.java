// 1. Create a class by name Triangle with the three sides a, b, and c as
// its member data. Include constructors and member methods to perform the
// following:

//     1. to accept the sides of a triangle.

//     2. to display the sides of a triangle.

//     3. to find whether the triangle is an equilateral or an isosceles or right angled triangle.

import java.util.Scanner;

class Triangle {

    int side1, side2, side3;

    Triangle (int s1, int s2, int s3) {

        side1 = s1;
        side2 = s2;
        side3 = s3;

    }

    void display() {

        System.out.println();
        System.out.println("The sides of your triangle are displayed below:");
        System.out.println("S1 = " + side1);
        System.out.println("S2 = " + side2);
        System.out.println("S3 = " + side3);

    }

    void check() {

        if ((side1 == side2) && (side2 == side3) ) {
            System.out.println("\nAnd, your triangle is equilateral\n");
        }

        else if (((side1 == side2) && (side1 != side3)) || ((side1 == side3) && (side1 != side2))) {
            System.out.println("\nAnd, your triangle is isosceles\n");
        }

        else if (((side1*side1 + side2*side2) == side3*side3) || ((side1*side1 + side3*side3) == side2*side2)) {
            System.out.println("\nAnd, your triangle is a right angled\n");
        }

        else {
            System.out.println("\nAnd, your triangle is scalene\n");
        }

    }
    
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");

        System.out.println("Enter the sides of a triangle: ");
        Scanner data = new Scanner(System.in);
        int a = data.nextInt();
        int b = data.nextInt();
        int c = data.nextInt();

        Triangle tri = new Triangle(a, b, c);
        tri.display();
        tri.check();

        data.close();

    }

}