/*
2.	Write a Java program to create a class called Car with a constructor that takes
 in the make, model, and year of the car, and a method to print out
  the car's make, model, and year.
 */
import java.util.Scanner;
class car
{
    int id,year;
    String name,brand;
    Scanner in=new Scanner(System.in);
    public void make()
    {
        System.out.println("Enter the Car Name : ");
        name=in.next();
        System.out.println("Enter the Car Model ID : ");
        id=in.nextInt();

    }
    public void model()
    {
        System.out.println("Ener the Brand Model Name : ");
        brand=in.next();

    }
    public void year()
    {
        System.out.println("Enter the car Year : ");
        year=in.nextInt();
    }
    
    public void display()
    {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("The Car Name : "+name);
        System.out.println("The Car Model ID : "+id);
        System.out.println("The Brand Model Name : "+brand);
        System.out.println("The car Year : "+year);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
    }
}

//main call
class basic
{
    public static void main(String args[])
    {
        car o = new car();
        o.make();
        o.model();
        o.year();
        o.display();
    }
}