// Write a Java program to take input and print the following on the console:
// “Name”
// “Roll number”
// “Branch”
// “Department”
// “University”

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");

        Scanner info = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = info.nextLine();
        System.out.print("Please enter your roll no: ");
        int rollno = info.nextInt();
        info.nextLine();
        System.out.print("Please enter your branch: ");
        String branch = info.nextLine();
        System.out.print("Please enter your department: ");
        String department = info.nextLine();
        System.out.print("Please enter your university's name: ");
        String uni = info.nextLine();

        System.out.println("\n-----------------------------\n");

        System.out.println("Your name: " + name);
        System.out.println("Your roll no: " + rollno);
        System.out.println("Your branch: " + branch);
        System.out.println("Your department: " + department);
        System.out.println("Your university: " + uni);
        System.out.println();

        info.close();
    }
}