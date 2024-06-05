//Volume of Sphere
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,i,n;
        System.out.print("Enter the Radius :");
        r=in.nextInt();
        double vol=1.333*(3.14*r*r*r);
        System.out.print("The Volume of Sphere is :"+vol);

    }
}