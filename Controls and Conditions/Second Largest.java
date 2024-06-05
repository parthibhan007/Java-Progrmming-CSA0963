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
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the Number : ");
            arr[i]=in.nextInt();
        }
        int temp=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

        System.out.print("The  Second Smallest element is : ");
        System.out.print(arr[n-2]);

    }
}