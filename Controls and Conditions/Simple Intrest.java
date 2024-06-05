//Simple Inte






rest
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int year,p_Amount;
        double Rate;
        String Senior;
        System.out.print("Enter the Year : ");
        year=in.nextInt();
        System.out.print("Enter the Principal Amount  :");
        p_Amount=in.nextInt();
        System.out.print("Enter whethear Senior citizen or not ");
        Senior=in.next();
        double num;
        if(Senior == "Yes")
        {
            num=num+(year*p_Amount*0.12);
        }
        else if(Senior == "No")
        {
            num=num+(year*p_Amount*0.10);
        }
        System.out.print("The Principle Amount is : "+num);
    }
}
