abstract class user
{
    abstract void user();
    public void display()
    {
        System.out.print("User can Acces the Websitr ");
    }
}

/*abstract*/ class employee extends user
{

    @Override
    void user()
    {
        System.out.println("Employee can acces the the website  ");
    }
}

public class Main
{
    public static void main(String args[])
    {
        employee o=new employee();
        o.user();
        o.display();

    }
}
