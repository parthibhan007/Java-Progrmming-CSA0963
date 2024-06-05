import java.util.Scanner;
public class Student {
    private String name;
    private int rollNumber;
    private double marks;
    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 101, 85.5);
        student1.displayDetails();
        student1.setName("Jane Smith");
        student1.setRollNumber(102);
        student1.setMarks(90.0);
        student1.displayDetails();
    }
}
