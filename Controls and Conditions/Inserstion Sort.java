//Insertion Sort
import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j,k,temp=0;
        System.out.print("Enter the number : ");
        n=in.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the array Element : ");
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[i]=temp;
                }
        }
        System.out.println("The Sorted Element   ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }


    }

}