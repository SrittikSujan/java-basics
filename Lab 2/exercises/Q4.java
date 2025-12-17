// Write a Java program to find whether a number is an Armstrong number
// or not. (Hint: A number is an Armstrong number if the sum of the cubes
// of the digits of the number is equal to the number itself. For example,
// 153 = 13 + 53 + 33 = 1 + 125 + 27).

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("\nEnter an integer number: ");
        Scanner data = new Scanner(System.in);

        int num = data.nextInt();
        int originalNum = num;
        int mod, sum = 0;
        while (num / 10 != 0 || num % 10 != 0) {
            mod = num % 10;
            sum += mod * mod * mod;
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println("\n" + originalNum + " is an Armstrong number.\n");
        } else {
            System.out.println("\n" + originalNum + " is not an Armstrong number.\n");
        }

        data.close();
    }
}
