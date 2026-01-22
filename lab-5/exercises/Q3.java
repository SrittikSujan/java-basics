// 3. Modify the program written for Problem 2 to do the following:

//     1. Add variables to each of the class. Add a no-argument constructor in
//     each of the classes to initialize the variables to default values (0 for
//     integers and NULL/EMPTY for strings).

//     2. Add parameterized constructors in each class to assign user inputs to
//     the member variables.

class Person {
	String Name;
	Person(String n) {
		Name = n;
	}
	void name(){
		System.out.println("Name is ... ");
	} 
}

class Student extends Person {
	int Roll;
	Student(String n, int r) {
		super(n);
		Roll = r;
	}
	void roll(){
		System.out.println("Roll is...");
	} 
}

class FirstYear extends Student {
	int Year1;
	FirstYear(String n, int r, int y) {
		super(n, r);
		Year1 = y;
	}
	void show(){
		System.out.println("Name: " + Name + " Roll: " + Roll + " Year: " + Year1);
	} 
	void year1(){
		System.out.println("1st year ... ");
	} 
}

class SecondYear extends Student {
	int Year2;
	SecondYear() {
		super("",0);
		Year2 = 0;
	}
	void year2(){
		System.out.println ("2nd year ... ");
	} 
}

class ThirdYear extends Student {
	int Year3;
	ThirdYear() {
		super("",0);
		Year3 = 0;
	}
	void year3(){
		System.out.println ("3rd year ... ");
	} 
}

class FourthYear extends Student {
	int Year4;
	FourthYear() {
		super("",0);
		Year4 = 0;
	}
	void year4(){
		System.out.println ("4th year ... ");
	} 
}

class Q3 {
	public static void main(String args []) {
		FirstYear stud1 = new FirstYear("XYZ", 1234, 1);
		stud1.show();
		System.out.println("-------------------");
		SecondYear stud2 = new SecondYear();
		stud2.year2();
		stud2.roll();
		stud2.name();
		System.out.println("-------------------");
		ThirdYear stud3 = new ThirdYear();
		stud3.year3();
		stud3.roll();
		stud3.name();
		System.out.println("-------------------");
		FourthYear stud4 = new FourthYear();
		stud4.year4();
		stud4.roll();
		stud4.name();
	}
}