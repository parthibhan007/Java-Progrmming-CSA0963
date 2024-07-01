//overloading 
//if the give function or class constructer name will be 
//same  and parameter will be Different

class operator
{
    int a,b;
    public void operator(int a,int b)
    {
        System.out.println("The First Number is : "+a);
        System.out.println("The Second Number is : "+b);
        System.out.println("The Total Number is  : "+(a+b));
        System.out.println("--------------------------------");
        System.out.println();

    }
    public void operator(float s,float n)
    {
        System.out.println("The First Number is : "+s);
        System.out.println("The Second Number is : "+n);
        System.out.println("The Total Number is : "+(n+s));
        System.out.println("-------------------------------");
        System.out.println();
    }
    public void operator(double d,double r)
    {
        System.out.println("The First Number is : "+d);
        System.out.println("The Secong Numbe is : "+r);
        System.out.println("The Total Numberfor Double is : "+(d+r));
        System.out.println("--------------------------------");
        System.out.println();

    }
}

//main class
public class basic
{
    public static void main(String args[])
    {
        operator o=new operator();
        o.operator(2,3);
        o.operator(2.2f,3.4f);
        o.operator(2.31,3.31);
        
    }
}

















