
/**
 * Write a description of class Employee here.
 *
 * @author Manan Tuli
 * @version 2020-10-10
 */
public class Employee
{
    private String name;
    private int age;
    private String city;
    
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String empName, int empAge, String empCity)
    {
        // initialise instance variables
        name = empName;
        age = empAge;
        city = empCity;
    }

    
    public void display()
    {
        System.out.println("Employee " + name + ", " + age + " years old, lives in " + city);
    }
    
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Siddharth",36,"Delhi");
        Employee employee2 = new Employee("Amruta",28,"Mumbai");
        
        employee1.display();
        employee2.display();
    }
}
