// 1. Modify the Java program BoxDemo.java to do the following:

//     1. create two objects of class Box

//     2. assign values to two objects using objects’ instance-variables and get
//     the volumes of two boxes

//     3. set values to two objects using parameterized methods and get the
//     volumes of two boxes

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class Q1 {
    public static void main(String[] args) {

        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");
        
        Box box1 = new Box();
        Box box2 = new Box();

        // Using instance variables
        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        box2.width = 5;
        box2.height = 10;
        box2.depth = 8;

        System.out.println("Volume of Box1: " + box1.volume());
        System.out.println("Volume of Box2: " + box2.volume());

        // Using parameterized method
        box1.setDim(7, 8, 9);
        box2.setDim(4, 6, 3);

        System.out.println("Updated Volume of Box1: " + box1.volume());
        System.out.println("Updated Volume of Box2: " + box2.volume());
    }
}
