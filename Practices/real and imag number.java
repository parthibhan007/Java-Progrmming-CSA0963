//Real Number and Complex Number 
//copy Constructor  -->  complex number imaginary number
class complex
{
    int real,img;

    public complex()
    {
        this.real=0;
        this.img=0;
    }

    public complex(int r, int i)
    {
        this.real=r;
        this.img=i;
        System.out.println("Real Number : "+real);
        System.out.println("Imaginary Number :"+img);
    }

    public String toString()
    {
        return "("+real+"+"+img+"i"+")";
    }

}


class basic
{
    public static void main(String args[])
    {
        complex o=new complex();
        System.out.println("Object i :"+o);
        complex o1=new complex(3,4);
        //o1.toString();
        System.out.print("Object 2 : "+o1);


    }
}