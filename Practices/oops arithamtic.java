/*
6.	Write a Java program to demonstrate method overriding with a simple calculator.
Create a parent class called Calculator with methods such as add(). subtract(),
 multiply(), and divide(). Then, create a child class called Scientific Calculator
 that overrides the multiply() method to perform a more complex calculation.
 */

import java.util.Scanner;

class calculator
{
    Scanner in = new Scanner(System.in);
    public void add()
    {
        System.out.println("Enter the integer A : ");
        int a=in.nextInt();
        System.out.println("Enter the integer B : ");
        int b=in.nextInt();
        System.out.println("The ADDTION of an Integer is  : "+(a+b));
    }
    public void sub()
    {
        System.out.println("Enter the integer A : ");
        int a=in.nextInt();
        System.out.println("Enter the integer B : ");
        int b=in.nextInt();
        System.out.println("The ADDTION of an Integer is  : "+(a-b));
    }
    public void mul()
    {
        System.out.println("Enter the integer A : ");
        int a=in.nextInt();
        System.out.println("Enter the integer B : ");
        int b=in.nextInt();
        System.out.println("The ADDTION of an Integer is  : "+(a*b));
    }
    public void div()
    {
        System.out.println("Enter the integer A : ");
        int a=in.nextInt();
        System.out.println("Enter the integer B : ");
        int b=in.nextInt();
        System.out.println("The ADDTION of an Integer is  : "+(a/b));
    }
}

class basic
{
    public static void main(String args[])
    {
        calculator o = new calculator();
        o.add();
        o.sub();
        o.mul();
        o.div();
    }
}