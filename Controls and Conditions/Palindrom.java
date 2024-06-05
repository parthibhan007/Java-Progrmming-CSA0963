//Parthibhan R
/*
if the given Number is reveresed means it will same
1001==1001
121=121
 */

import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int i,j,n,k;
        int rem=0;
        System.out.print("Enter the Number :");
        n=in.nextInt();
        int temp =n;
        while(temp!=0)
        {
            int rev = temp % 10;
            rem = rem * 10 + rev;
            temp=temp/10;
        }
        if(rem == n)
        {
            System.out.print("Entered Element is Palindrome : "+rem);
        }
        else
        {
            System.out.print("Entered Element is Not a Palindrome"+rem);
        }

    }
}
