/*
 * This program demonstrates access modifiers, encapsulation, and inheritance in Java.
 * The bank_account class stores account details using public, protected, and private
 * variables. The private balance is accessed through setter and getter methods.
 * The savings_account class inherits the account number and account holder details
 * from bank_account using the super() constructor.
 * The main method creates bank account objects, updates a balance, reads a balance,
 * and creates a savings account using inheritance.
 */

package Constructors.Level_3;

class bank_account {
    public int account_number;
    protected String account_holder;
    private double balance;

    // Constructor used to initialize the account details.
    bank_account(int account_number, String account_holder, double balance) {
        this.account_number = account_number;
        this.account_holder = account_holder;
        this.balance = balance;
    }

    // Updates the private balance using a setter method.
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Returns the private balance using a getter method.
    public double getBalance() {
        return balance;
    }

    // Displays the complete details of the bank account.
    public void bank_account_details() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Holder: " + account_holder);
        System.out.println("Balance: " + balance);
    }
}

class savings_account extends bank_account {

    // Calls the parent class constructor to initialize the account details.
    savings_account(int account_number, String account_holder, double balance) {
        super(account_number, account_holder, balance);
    }

    // Displays the account number and account holder of the savings account.
    public void saving_account_details() {
        System.out.println("Account number: " + account_number);
        System.out.println("Account Holder: " + account_holder);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {

        // Creating the first bank account object and displaying its details.
        bank_account obj = new bank_account(10169, "Akhil Durgesh", 50000);
        obj.bank_account_details();

        System.out.println();

        // Creating the second bank account object and displaying its details.
        bank_account obj1 = new bank_account(10180, "Abhishek", 97000);
        obj1.bank_account_details();

        System.out.println();

        // Updating the balance of the first account using the setter method.
        obj.setBalance(85000);

        System.out.println();

        // Getting the balance of the second account using the getter method.
        double balance = obj1.getBalance();
        System.out.println("Second object details: " + balance);

        // Creating a savings account using inheritance from bank_account.
        savings_account obj2 = new savings_account(10147, "Sabbu", 100000);
        obj2.saving_account_details();
    }
}