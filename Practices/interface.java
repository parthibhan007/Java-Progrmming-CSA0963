//interface
interface forest
{
    void animal();
    void birds();

    /*default void bud()
    {
        System.out.print("Enter the Animal :");
    }*/
}

class debug implements forest
{
    public void animal()
    {
        System.out.println("Enter the Birds : ");
    }

    public void birds()
    {
        System.out.print("Enter the Animals : ");
    }

}

class basic
{
    public static void main(String args[])
    {
        debug o=new debug();
        o.animal();
        o.birds();

    }
}





