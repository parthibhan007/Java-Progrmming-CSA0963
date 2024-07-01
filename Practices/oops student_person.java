/*
5.	Write a Java program to create a class called Person with a constructor
that takes in a name and age, and a method to print out the person's name and age. (Overloading).
 */

import java.util.Scanner;

class person
{
    int age,id;
    String name;
    Scanner in = new Scanner(System.in);
    public person(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println("Enter the Name of Student :");
        name=in.next();
        System.out.println("Enter the Age : ");
        age=in.nextInt();

    }
    public person(int id)
    {
        this.id=id;
        System.out.println("Enter Register Number : ");
        id=in.nextInt();
    }
    void display()
    {
        System.out.println("The Name of Student :"+name);
        System.out.println("The Age : "+age);
        System.out.println("The Register Number : "+id);

    }
}

//main class
class basic
{
    public static void main(String args[])
    {
        person o = new person(19, "Ram");
        person o1 = new person(192224275);
        o.display();
    }

}