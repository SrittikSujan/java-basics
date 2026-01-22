class Rectangle {
    int height;
    int width;
    Rectangle() {
        height = 10; width = 3; // here we are explicitly defining the members.
    }

    void display() {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
    }

}

class Dctor1 {

    public static void main(String args[]) {

        // creating an object
        Rectangle rec = new Rectangle();
        rec.display();

    }

}