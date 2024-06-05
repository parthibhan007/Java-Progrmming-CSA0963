1111..pattern  1 22 333 4444

import java.lang.*;
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num=in.nextInt();
       // System.out.print("The entered Number is : "+num);
        for(int i=1;i<=num;i++)
        {

           {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);

                }
                System.out.print("\t");
            }
        }
    }
}


