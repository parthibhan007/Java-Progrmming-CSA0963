//Hiddig the things Using (getters and setters )

class basic
{
    private int lenght,width;

    int getLenght()
    {
        //to return the value
        return lenght;
    }

    int getWidth()
    {
        return width;
    }

    void setLenght(int l)
    {
        // to assign the value to the variable
        lenght=l;
    }

    void setWidth(int w)
    {
        width=w;
    }


    int area()
    {
        int a = lenght * width;
       // return a;
        System.out.print("The Area of Recatngle is : "+a);
    }
}

class rectangle
{
    public static void main(String []args)
    {
        basic o =new basic();
        o.setLenght(10);
        o.setWidth(20);
        System.out.print("The Height of Recatngle is : "+o.getLenght());
        System.out.print("The Width of Recatngle is : "+o.getWidth());
        //System.out.print("The Area of Recatngle is : "+o.area());
    }
}