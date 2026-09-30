import java.util.Scanner;

public class ATM_Simulate{
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter the Account Holder");
        String name = sc.next();
        System.out.println("Enter the Account number");
        int acc_num = sc.nextInt();
        System.out.println("Enter the balance");
        double balance = sc.nextDouble();

        bank_account obj = new bank_account();
        obj.setAccount_holder(name);
        obj.setAccount_number(acc_num);
        obj.setBalance(balance);

        boolean result = true;

        while(result){
        System.out.println("1. Deposit");
        System.out.println("2. withdraw");
        System.out.println("3. Check balance");
        System.out.println("Enter the operation you need to perform");
        int choice = sc.nextInt();

        switch(choice){

            case 1 : obj.deposit();
                      break;

            case 2 : obj.withdraw();
                     break;

            case 3 : obj.checkbalance();
                     break;

            default: System.out.println("Enter the valid choice");
                     break;

        }

        System.out.println("Do you need to perform another operation (0,1)");
        int a = sc.nextInt();
        if(a==1){
            result = true;
        }else{
            result = false;
        }
        }
    }
}

class bank_account{

    String account_holder;
    int account_number;
    double balance;

    public static final Scanner sc = new Scanner(System.in);

    public void setAccount_holder(String account_holder){
        this.account_holder = account_holder;
    }

    public void setAccount_number(int account_number){
        this.account_number = account_number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(){
        System.out.println("Enter the amount to deposit");
        balance = balance + sc.nextDouble();
        System.out.println("Total balance"+balance);
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw");
        int amount = sc.nextInt();
        if(balance<amount){
            System.out.println("Insufficient balance");
        }else{
            balance = balance-amount;
            System.out.println("You withdrawn: "+amount);
            System.out.println("You current balance: "+balance);
        }
    }

    public void checkbalance(){
        System.out.println("Balance: "+balance);
    }

}