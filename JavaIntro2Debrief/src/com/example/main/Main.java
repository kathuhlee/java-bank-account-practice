package com.example.main;

// import statement for our BankAccount class
import com.example.bankaccount.BankAccount;

public class Main {

    /*
        Your main method here should create two instances of BankAccount
            one as a savings type
            one as a checkings type

        Call each method of each object instance to verify that they work as intended

        If you have extra time, check for invalid input as well (negative numbers, overdrafts, etc.)
            we do this to ensure that our class handles input as expected
            this means that it also has to handle invalid input appropriately
     */
    public static void main(String[] args) {
        BankAccount savings = new BankAccount(0, "Kathleen Wong", 1, "savings");
        BankAccount checking = new BankAccount(0, "Mochi Wong", 2, "checking");

        System.out.println(savings.toString());
        System.out.println(checking.toString());

        System.out.println(savings.deposit(1000));
        System.out.println(checking.deposit(10));

        System.out.println(savings.toString());
        System.out.println(checking.toString());

        System.out.println(savings.withdraw(100));
        System.out.println(checking.withdraw(1));

        System.out.println(savings.toString());
        System.out.println(checking.toString());

        System.out.println(savings.deposit(9000));
        System.out.println(checking.deposit(200));

        System.out.println(savings.toString());
        System.out.println(checking.toString());

        
    }
}
