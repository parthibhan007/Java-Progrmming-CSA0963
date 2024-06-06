import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
        }


    }

}
