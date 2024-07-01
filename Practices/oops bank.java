/*
3.	Write a Java program to create a class called BankAccount with a constructor
that takes in an account number and an initial balance, and
 methods to deposit and withdraw money from the account.
 */

import java.util.Scanner;

class bank
{
    Scanner in = new Scanner(System.in);
    int acc_no,ini_bal=0,pin,dep,withdraw,dep_pin,with_pin;
    String name;
    public bank()
    {
        System.out.println("Ener the User Name : ");
        name=in.next();
        System.out.println("Enter the Account Number : ");
        acc_no=in.nextInt();
        System.out.println("Enter the PIN to Set : ");
        pin=in.nextInt();
    }
    void deposit()
    {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("The User Name : "+name);
        System.out.println("Enter the Account Number : "+acc_no);
        System.out.println("Enter the PIN to Deposit : ");
        dep_pin=in.nextInt();
        if(dep_pin==pin)
        {
            System.out.println("Enter the Amount  to be Deposit : ");
            dep=in.nextInt();
            ini_bal=ini_bal+dep;
            System.out.println("The Balance Amount is : "+ini_bal);
        }
        else
        {
            System.out.println("----Wrong PIN---");

        }
        System.out.println();
        System.out.println("--------------------------------");



    }
    void withdraw()
    {
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("The User Name : "+name);
        System.out.println("Enter the Account Number : "+acc_no);
        System.out.println("Enter the PIN to withdraw : ");
        with_pin=in.nextInt();
        if(with_pin==pin)
        {
            System.out.println("Enter the Amount to withdrawal : ");
            withdraw=in.nextInt();
            ini_bal=ini_bal-withdraw;
            System.out.println("The Balance Amount is : "+ini_bal);
        }
        else
        {
            System.out.println("----Wrong PIN---");

        }
        System.out.println();

        System.out.println("--------------------------------");


    }
}

//main class
class basic
{
   public static void main(String args[])
   {
       bank o = new bank();
       o.deposit();
       o.withdraw();
   }
}