import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.print(n+"*"+i+"="+n*i);
            System.out.println();
        }

    }

}
