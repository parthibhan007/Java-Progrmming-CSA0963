//multi-level inhertances

/*

A->B->C

A
B - A
C - B

*/

class grand_father
{
    public grand_father()
    {
        System.out.println("I Bourght a New Houses : ");
    }
}

class father extends grand_father
{
    public father()
    {
        System.out.println("I will Brought New BMW Car : ");
    }
}

class son extends father
{
    public son()
    {
        System.out.println("I will Got My Bachelor Degree : ");
    }
}


//Main Class

public class basic
{
    public static void main(String args[])
    {
        son o =new son();
    }
}






