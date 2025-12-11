public class relational {
    public static void main(String[] args) {
     
        int a = 50, b = 60, x = 30, y =30;
        boolean L, G, LE, GE, E, NE;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

        L = a < b;
        G = a > b;
        LE = a <= b;
        GE = x >= y;
        E = x == y;
        NE = a != b;

        System.out.println("a < b = " + L);
        System.out.println("a > b = " + G);
        System.out.println("a <= b = " + LE);
        System.out.println("x >= y = " + GE);
        System.out.println("x == y = " + E);
        System.out.println("a != b = " + NE);

    }
}
