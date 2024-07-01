//  Array of Object

class student
{
    int reg;
    String name;
    student(int a, String n)
    {
        this.reg=a;
        this.name=n;

    }
    void display()
    {
        System.out.println("The Student name : "+reg);
        System.out.println("The Reg_Number : "+name);
        System.out.println("---------------------------");
        System.out.println();
    }

}
class basic
{
    public static void main(String args[])
    {
        student o1=new student(234,"Ram");
        o1.display();
        student [] o =new student[6];
        o[0]=new student(1234,"Sam");
        o[1]=new student(1235,"Ram");
        o[2]=new student(1236,"Kevin");
        o[3]=new student(1237,"Allen");
        o[4]=new student(1238,"Parthi");
        o[5]=new student(1239,"Udhay");
        for(int i=0;i<=5;i++)
        {
            o[i].display();
        }


    }
}