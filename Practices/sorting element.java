import java.util.Scanner;
class basic
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int n=5;
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Number : ");
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting the Element : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }

    }
}