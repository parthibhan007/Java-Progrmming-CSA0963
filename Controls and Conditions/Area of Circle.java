 import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r;
        double area;
        System.out.print("Enter the Radius : ");
        r=in.nextInt();
        area=3.14*r*r;
        System.out.print("The Area of Circle: "+area);
    }
}