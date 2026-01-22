class Rectangle {

    int height, width;

    Rectangle(int h, int w) {
        height = h;
        width = w;

    }

    int area() {

        return height * width;

    }

    void display() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }

}

class Pctor {

    public static void main(String args[]) {
        // creating object
        Rectangle rec = new Rectangle(7, 21);
        rec.display();
        System.out.println("Area = " + rec.area());
    }

}