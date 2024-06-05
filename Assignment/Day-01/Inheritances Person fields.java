import java.util.Scanner;
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayDetails(); 
        System.out.println("Salary: $" + salary);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 30, 50000);
        employee1.displayEmployeeDetails();
    }
}
