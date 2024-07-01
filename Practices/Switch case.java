import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ch,c;
        System.out.println("1. ADDITION ");
        System.out.println("2.SUBTRACTION ");
        System.out.println("3.MULTIPLICATION ");
        System.out.println("4. DIVISION ");
        //System.out.println("Enter the Choose: ");
        System.out.println("Enter the Choose : ");
        ch=in.nextInt();
        System.out.println("Enter the Two Integer : ");
        int a=in.nextInt();
        int b=in.nextInt();
        switch(ch)
        {
            case 1:
                c=a+b;
                System.out.println("1.  ADDITION : "+c);
                break;
            case 2:
                c=a-b;
                System.out.print("2. SUBTRACTION : "+c);
                break;
            case 3:
                c=a*b;
                System.out.print("3. MULTIPLICATION "+c);
                break;
            case 4:
                c=a/b;
                System.out.print("4. DIVISION : "+c);
                break;
        }
    }
}