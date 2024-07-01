//one base multiple Drive Class
//if we can use one base class to another Drive class means is cal
//hierarchical inheritances

class shape
{
    float length,width,radius,breath;
}


class rectangle extends shape
{
    public rectangle(int a,int w)
    {
        this.length=a;
        this.width=w;
        System.out.println("The Area of Rectangle is : "+(length * width));
    }
}

class circle extends shape
{
    public circle(int r)
    {
        this.radius=r;
        System.out.println("The Area of the Circle is : "+(r * r));
    }
}

class square extends shape
{
    public square(int l,int b)
    {
        this.length=l;
        this.breath=b;
        System.out.println("The Area of the Square is : "+(length * breath));
        
    }
}


//main class
public class basic
{
    public static void main(String args[])
    {
        square o=new square(12,13);
        rectangle o1=new rectangle(3,4);
        circle o2=new circle(5);
       
        

    }
    
}





