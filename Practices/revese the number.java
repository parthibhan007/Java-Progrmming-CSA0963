import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=213123;
        int temp=n;
        int rem=0;
        while(temp!=0)
        {
            int rev=temp%10;
            rem=rem*10+rev;
            temp=temp/10;
        }
        System.out.println(rem);
    }
}