//Copy Constructor  

import java.util.Scanner;
class copy
{
    int age;
    String name;

    void getdetails()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Name : ");
        name=in.next();
        System.out.println("Enter the Age : ");
        age=in.nextInt();
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);

    }

    public copy(int a,String n)
    {
        age=a;
        name=n;
        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);

    }


    public copy(copy cc)
    {
        System.out.println("Copy Constructer  : ");
        age=cc.age;
        name=cc.name;

        System.out.println("Name  : "+name);
        System.out.println("Age   : "+age);
    }

}

class basic
{
    public static void main(String args[])
    {

        copy cc = new copy(2,"Ram");
        cc.getdetails();
        copy cc2 =new copy(cc);
    }
}