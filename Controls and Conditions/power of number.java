import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int base,expo;
        int result=1;
        System.out.print("Enter the base number : ");
        base=in.nextInt();
        System.out.print("Enter the expo Number : ");
        expo=in.nextInt();
        for(int i=0;i<expo;i++)
        {
            result=result*base;
        }
        System.out.print("The Power of the Number is: "+result);
    }
}