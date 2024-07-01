class box
{
    int height=2,width=8;

    public box()
    {
        System.out.println("The Constructured is Aacept : ");
        int add = height * width;
        System.out.println("The Area of the Rectangle : "+add);
    }
    public box(int x,int y)
    {
        height=x;
        width=y;
        System.out.println("The Addition of the Rectangle : "+(height+width));
    }
    public box(int x)
    {
        height=width=x;
        System.out.println("The Aea of  the Recangle : "+height);
    }
}



class basic
{
    public static void main(String args[])
    {
       box o1=new box();
       box o2=new box(1,2);
       box o3=new box(2);
    }
}