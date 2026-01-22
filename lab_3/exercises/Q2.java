class Rectangle {
    double length;
    double width;

    void setDim(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

class Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setDim(10, 5);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
