public class logical {
    public static void main(String[] args) {
        
        int a = 50, b = 60, c = 70;
        boolean x, y, z;

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println();
        System.out.println("Working of Relational Operators");
        System.out.println();
        x = (a < b) || (a > c);
        System.out.println("(a < b) || (a > c) is " + x);
        y = (a < b) && (a > c);
        System.out.println("(a < b) && (a > c) is " + y);
        z = !(b > c);
        System.out.println("!(b > c) is " + z);

    }
}
