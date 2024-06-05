import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j,k;
        System.out.print("Enter the Number : ");
        n=in.nextInt();
        int [] arr=new int[n];
        int sum=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the Number : ");
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }

        System.out.print("The Sum of the Array Element is : "+sum);
    }
}