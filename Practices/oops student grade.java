/*
1.	Write a Java program to create a class called Student with a constructor
 that takes in a name, ID number, and a list of grades, and methods to calculate
 and return the student's average grade and letter grade
 */
import java.util.Scanner;
class student
{
    int id;
    String name;
    int [] marks =new int[5];
    int sum=0;
    public student()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Student ID : ");
        id=in.nextInt();
        System.out.println("Enter the Student Name : ");
        name=in.next();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the Student Marks : ");
            marks[i]=in.nextInt();
            sum=sum+marks[i];

        }
        System.out.println("The Grade Average is : "+(sum/5));
        

    }
}

class display extends student
{
    public char display()
    {
        for(int i=0;i<=5;i++)
        {
            if(marks[i]>=90 && marks[i]<100)
            {
                return 'A';
            }
            else if (marks[i]>=80 && marks[i]<90)
            {
                return 'B';
            }
            else if (marks[i]>=70 && marks[i]<80)
            {
                return 'C';
            }
            else if (marks[i]>=50 && marks[i]<70)
            {
                return 'D';
            }
            else
            {
                return 'F';
            }

        }
        return 0;
    }
}


//main class
class baisc
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        display o = new display();
        //o.display();


    }
}


