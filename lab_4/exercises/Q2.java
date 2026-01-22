// 2. A complex number is of the form x + iy where x is the real part and y
// is an imaginary part of the number. Design a Java class called Complex
// representing the complex number with member data x and y of the number.
// Include constructors and member methods to perform the following:

//     1. to accept and display a complex number

//     2. to find the sum of two complex numbers

//     3. to find the product of two complex numbers

import java.util.*;

class Complex {

    int real1, real2;
    int imaginary1, imaginary2;

    Complex(int x1, int y1, int x2, int y2) {

        real1 = x1;
        imaginary1 = y1;
        real2 = x2;
        imaginary2 = y2;

    }

    void display () {

        System.out.println("Your first complex number is: " + real1 + " + i" + imaginary1);
        System.out.println("Your second complex number is: " + real2 + " + i" + imaginary2);

    }

    void sum () {
        
        int real = real1 + real2;
        int imaginary = imaginary1 + imaginary2;

        System.out.println("Your complex number after sum is: " + real + " + i" + imaginary);

    }

    void product () {

        int real = real1*real2 - imaginary1*imaginary2;
        int imaginary = real1*imaginary1 + real2*imaginary2;

        System.out.println("Your complex number after product is: " + real + " + i" + imaginary);

    }

}

public class Q2 {
    public static void main(String[] args) {
        
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");

        Scanner data = new Scanner(System.in);
        System.out.print("Enter the real part of your complex number 1: ");
        int r1 = data.nextInt();
        System.out.print("Enter the imaginary part of your complex number 1: ");
        int i1 = data.nextInt();
        System.out.print("Enter the real part of your complex number 2: ");
        int r2 = data.nextInt();
        System.out.print("Enter the imaginary part of your complex number 2: ");
        int i2 = data.nextInt();

        Complex comp = new Complex(r1, i1, r2, i2);
        comp.display();
        comp.sum();

        data.close();
    }

}