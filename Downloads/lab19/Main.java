// Parent Class
class Person
{
    // Default Constructor
    Person()
    {
        System.out.println("Person Default Constructor Called");
    }

    // Parameterized Constructor
    Person(String name)
    {
        System.out.println("Person Parameterized Constructor Called");
        System.out.println("Name: " + name);
    }
}

// Child Class
class Student extends Person
{
    // Default Constructor
    Student()
    {
        // Calling another constructor of same class
        this("SAAD Ali", 13);

        System.out.println("Student Default Constructor Called");
    }

    // Parameterized Constructor
    Student(String name, int rollNo)
    {
        // Calling parent class constructor
        super(name);

        System.out.println("Student Parameterized Constructor Called");
        System.out.println("Roll Number: " + rollNo);
    }
}

// Main Class
public class Main
{
    public static void main(String[] args)
    {
        // Creating object
        Student s1 = new Student();
    }
}