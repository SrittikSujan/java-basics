import java.util.*;

public class arithmetic {
    public static void main(String[] args) {

        int A, B;
        Scanner data = new Scanner(System.in);
        System.out.print("\nEnter the value if A: ");
        A = data.nextInt();
        System.out.print("Enter the value of B: ");
        B = data.nextInt();

        System.out.println();
        System.out.println("INTER ARITHMETIC:");
        System.out.println("Sum = " + (A + B));
        System.out.println("Difference = " + (A - B));
        System.out.println("Product = " + (A * B));
        System.out.println("Quotient = " + (A / B));
        System.out.println("Remainder = " + (A % B));
        System.out.println();

        data.close();

    }
}