class Person {
    void name() {
        System.out.println(" Name is ... ");
    }
}

class Student extends Person {
    void roll() {
        System.out.println(" Roll is ... ");
    }
}

class FirstYear extends Student {
    void year() {
        System.out.println(" 1 st year ... ");
    }
}

class multi_inheritence {
    public static void main(String args[]) {
        FirstYear stud = new FirstYear();
        stud.year();
        stud.roll();
        stud.name();
    }
}