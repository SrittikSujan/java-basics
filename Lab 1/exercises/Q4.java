// Write a Java program to accept the number of seconds and display its
// equivalent number of hours, number of minutes and number of seconds (Hint:
// Use / and % operators).

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n---------------------------\n");

        Scanner value = new Scanner(System.in);
        System.out.print("Please enter the no. of seconds: ");
        long data = value.nextLong();
        
        System.out.println("\n---------------------------\n");

        System.out.println("The corresponding hours, minutes and seconds are mentioned below: ");
        long hours = data / 3600;
        System.out.printf("Hours: %d\n", hours);
        long minutes = (data % 3600) / 60;
        System.out.printf("Minutes: %d\n", minutes);
        long seconds = data % 60;
        System.out.printf("Seconds: %d\n\n", seconds);

        value.close();
    }
}