import java.util.Scanner;

class uniMember {
    String name;
    String gender;

    class Student {
        int rollNumber;

        void displayStudent() {
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    class Faculty {
        int employeeId;

        void displayFaculty() {
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Employee ID: " + employeeId);
        }
    }
}

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uniMember u = new uniMember();

        System.out.print("Enter Name: ");
        u.name = sc.nextLine();

        System.out.print("Enter Gender: ");
        u.gender = sc.nextLine();

        System.out.println("\n1. Student\n2. Faculty");
        System.out.print("Choose type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            uniMember.Student s = u.new Student();
            System.out.print("Enter Roll Number: ");
            s.rollNumber = sc.nextInt();
            s.displayStudent();
        } else {
            uniMember.Faculty f = u.new Faculty();
            System.out.print("Enter Employee ID: ");
            f.employeeId = sc.nextInt();
            f.displayFaculty();
        }
    }
}
