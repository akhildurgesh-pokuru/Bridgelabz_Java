/*
 * Program to demonstrate the use of final, static, protected,
 * instanceof, and object creation using a Bank Account system.
 */

package ThisStaticFinal;

class account {
    final int account_number;
    protected String account_holder;
    static String bank_name = "HDFC";
    static int total_accounts;

    account(int account_number, String account_holder) {
        // final variable must be initialized only once.
        this.account_number = account_number;
        this.account_holder = account_holder;

        // Increase the total account count whenever a new account is created.
        total_accounts++;
    }

    // Static method to display the total number of accounts.
    public static void total_accounts() {
        System.out.println("Total Accounts: " + total_accounts);
    }

    public void display() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Holder: " + account_holder);
        System.out.println("Bank Name: " + bank_name);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        // Create two account objects using the account constructor.
        account obj = new account(100169, "Akhil");
        account obj1 = new account(10180, "abhishek");

        // Check whether obj is an instance of the account class.
        if (obj instanceof account) {
            System.out.println("yes it is..");
        }

        System.out.println();

        // Check whether obj1 is an instance of the account class.
        if (obj1 instanceof account) {
            System.out.println("Yes it is..");
        }

        System.out.println();

        // Call the static method using the class name.
        account.total_accounts();

        // Display details of the first account.
        obj.display();
        System.out.println();

        // Display details of the second account.
        obj1.display();
    }
}