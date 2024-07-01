import java.util.Scanner;
class basic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=10;
        int w1=0,w2=1;
        while(n!=0)
        {
            System.out.print(w1+"\t");
            int w3=w1+w2;
            w1=w2;
            w2=w3;
            n--;
        }
    }
}