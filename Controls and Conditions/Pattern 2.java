//pattern ***** **** ** *

import java.lang.*;
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the Number : ");
        n = in.nextInt();
        for (i=n-1;i>=0; i--)
        {
            for(int j=n-i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\t");
        }
    }
}
