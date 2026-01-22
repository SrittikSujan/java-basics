// Modify the Java program shown in Listing 5.2 to do the following:

//     1. Add a class FirstSem that is an extension of class FirstYear. Add
//     a function void subjects() to the class FirstSem that displays “6
//     theory courses and 2 lab courses”. Compile and run the program.
//     Apply the concept of multi-level inheritance.

//     2. Add three more classes, SecondYear, ThirdYear, FourthYear which
//     are extensions of class Student. Add three functions, void year2(),
//     void year3(), void year4() to three new classes SecondYear, ThirdYear,
//     FourthYear respectively. The function void year2() displays “2nd
//     year...”, function void year3() prints “3rd year...”, and function void
//     year4() shows “4th year...” Apply the concept of hierarchical inheritance.

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
    void year1() {
        System.out.println(" 1 st year ... ");
    }
}

class SecondYear extends FirstYear {
    void year2() {
        System.out.println(" 2 nd year ... ");
    }
}

class ThirdYear extends SecondYear {
    void year3() {
        System.out.println(" 3 rd year ... ");
    }
}

class FourthYear extends ThirdYear {
    void year4() {
        System.out.println(" 4 th year ... ");
    }
}

class FirstSem extends FirstYear {
    void subjects() {
        System.out.println(" 6 theory courses and 2 lab courses ");
    }
}

class Q2 {
    public static void main(String args[]) {
        FirstYear stud = new FirstYear();
        stud.year1();
        stud.roll();
        stud.name();
        
        FirstSem sem = new FirstSem();
        sem.subjects();

        SecondYear stud2 = new SecondYear();
        stud2.year2();
        stud2.roll();
        stud2.name();

        ThirdYear stud3 = new ThirdYear();
        stud3.year3();
        stud3.roll();
        stud3.name();

        FourthYear stud4 = new FourthYear();
        stud4.year4();
        stud4.roll();
        stud4.name();
    }
}