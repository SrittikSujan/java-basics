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

class single_inheritence {
    public static void main(String args[]) {
        Student stud = new Student();
        stud.roll();
        stud.name();
    }
}