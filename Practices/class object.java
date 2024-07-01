class rectangle
{
    int height,width;

    void area()
    {
        int add=height*width;
        System.out.print("The Area of the Recangle :"+add);
    }
}

class basic
{
    public static void main(String args[])
    {
        rectangle o=new rectangle();
        o.height=33;
        o.width=23;
        o.area();
    }
}