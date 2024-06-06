import java.util.Scanner;
import java.lang.String;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j;
        boolean prime=true;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        if(n<=1)
        {
            prime=false;
        }
        else
        {
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    prime=false;
                    break;
                }
            }

        }
        if(prime)
        {
            System.out.print("It is Prime ");
        }
        else
        {
            System.out.print("It is Not a Prime ");
        }




    }

}
