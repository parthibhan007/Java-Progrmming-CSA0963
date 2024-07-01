import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the String  : ");
        str=in.next();
        String s="";

        for(int i=0;i<str.length();i++)
        {
            char b=str.charAt(i);
            s=b+s;

        }
        System.out.println("After Reverse the String is : "+s);
    }
}