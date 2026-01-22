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

class Teacher extends Person {
    void empid() {
        System.out.println(" ID is ... ");
    }
}

class heirarchical_inheritence {
    public static void main(String args[]) {
        Teacher t = new Teacher();
        t.empid();
        t.name();
    }
}