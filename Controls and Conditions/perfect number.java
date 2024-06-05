import java.lang.*;
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int i,n,sum=0;
        System.out.print("Enter the  number : ");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                 sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.print("entered Nummber is  a Perfect NUmber : "+n);
        }
        else {
            System.out.print("entere Nummber is Not a Perfect NUmber : "+n);
        }
    }
}