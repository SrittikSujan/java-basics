// Create a Java class called Account with the member data account number,
// name, balance. Using constructors and member methods, perform the fol
// lowing:

//     1. to accept and display the details of an account

//     2. to credit the account with some amount and display the message “A/C
//     credited with Rs. XYZ and Balance: Rs. ABC” (where, XYZ is the
//     amount credited and ABC is the new balance in the account).

//     3. to debit the account with some amount and display the message “A/C
//     debited with Rs. XYZ and Balance: Rs. ABC” (where, XYZ is the
//     amount debited and ABC is the new balance in the account).

class Q3 {
    int accNo;
    String name;
    double balance;

    Q3(int acc, String n, double bal) {
        accNo = acc;
        name = n;
        balance = bal;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + balance);
    }

    void credit(double amt) {
        balance += amt;
        System.out.println("A/C credited with Rs. " + amt +
                " and Balance: Rs. " + balance);
    }

    void debit(double amt) {
        if (amt > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amt;
            System.out.println("A/C debited with Rs. " + amt +
                    " and Balance: Rs. " + balance);
        }
    }

    public static void main(String[] args) {

        System.out.println("\nName: Srittik Sujan Mohapatra");
        System.out.println("Roll No: 2430259");

        System.out.println("\n-----------------------------\n");
        
        Q3 acc = new Q3(101, "Rahul", 5000);

        acc.display();
        acc.credit(1500);
        acc.debit(2000);
    }
}
