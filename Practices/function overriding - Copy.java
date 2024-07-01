//function overriding 
//if the one class of the variable can be modifid from another class that can 
//function overriding 

class user
{
    int id;
    String name;
    public user(int id,String name)
    {
        this.id=id;
        this.name=name;
        System.out.println("The ID of the Employee : "+id);
        System.out.println("The Name of the Employee : "+name);
        System.out.println("------------------------------------");
        System.out.println();
        
    }
}

class employee extends user
{
    int salary;
    String department;
    public employee(int id,String name,int salary,String department)
    {
        super(id,name);
        this.salary=salary;
        this.department=department;
        System.out.println("The ID of the Employee : "+id);
        System.out.println("The Name of the Employee : "+name);
        System.out.println("The Salary of the Employee : "+salary);
        System.out.println("The Department of the Employee : "+department);
        
    }
}


public class basic
{
    public static void main(String args[])
    {
        employee o=new employee(192224275,"Parthibhan",12000,"AI&DS");
    }
}