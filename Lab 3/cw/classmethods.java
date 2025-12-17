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

public class classmethods {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        // initialize mybox
        mybox.setDim(10, 20, 15);
        // get volume of box
        vol = mybox.volume();
        System.out.println("Volume: " + vol);
    }
}
