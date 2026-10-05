package ObjectModeling;


import java.util.ArrayList;
import java.util.List;

class Customer{
    String customer_name;
    int acc_num;
    private double balance;
    List<Accounts> accounts;

    Customer(String customer_name,int acc_num, double balance){
        this.customer_name = customer_name;
        this.acc_num = acc_num;
        this.balance = balance;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Accounts account){
        accounts.add(account);
    }

    public void CustomerAccounts(){
        System.out.println("Customer Accounts: ");
        for(Accounts account : accounts){
            System.out.println("Account number: "+ account.acc_num);
            System.out.println("Holder Name: "+account.holder_name);
            System.out.println("Balance: "+account.balance);
            System.out.println();
        }
    }
}

class Accounts{
    int acc_num;
    String holder_name;
    double balance;

    Accounts(int acc_num,String holder_name,double balance){
        this.acc_num = acc_num;
        this.holder_name = holder_name;
        this.balance = balance;
    }
}

class Bank{
    String bank_name;
    String ifsc;
    List<Customer> customers;

    Bank(String bank_name,String ifsc){
        this.bank_name = bank_name;
        this.ifsc = ifsc;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void BankCustomers(){
        System.out.println("Bank Customer: ");
        for(Customer customer : customers){
            System.out.println("Bank Name: "+bank_name);
            System.out.println("Bank IFSC: "+ifsc);
            System.out.println("Customer Name: "+customer.customer_name);
            System.out.println("Account Number: "+customer.acc_num);
            System.out.println();
        }
    }
}



public class BankCustomerAssociation{
    public static void main(String[] args){
        Customer customer1 = new Customer("Akhil",233529,90000);
        Customer customer2 = new Customer("Charan",34820,12000);

        Accounts customer1_account1 = new Accounts(324521,"Akhil",94000);
        Accounts customer1_account2 = new Accounts(4532342,"Akhil",55000);

        Accounts customer2_account1 = new Accounts(384893,"Charan",56000);
        Accounts customer2_account2 = new Accounts(8832943,"Charan",98222);

        customer1.addAccount(customer1_account1);
        customer1.addAccount(customer1_account2);

        customer2.addAccount(customer2_account1);
        customer2.addAccount(customer2_account2);



        Bank bank = new Bank("HDFC","31AH90");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        customer1.CustomerAccounts();
        System.out.println();
        customer2.CustomerAccounts();

        System.out.println();

        bank.BankCustomers();

    }
}