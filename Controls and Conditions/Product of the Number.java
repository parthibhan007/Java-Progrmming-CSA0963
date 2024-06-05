import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,sum=1;
        System.out.print("Enter the Number : ");
        n=in.nextInt();
        while(n!=0)
        {
            int rem=n%10;
            sum=sum*rem;
            n=n/10;
        }
        System.out.print("The Product of the Number is : "+sum);
    }
}