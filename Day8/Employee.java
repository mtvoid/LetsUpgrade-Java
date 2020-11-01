import java.util.Scanner;

/**
 * Class Employee
 *
 * @author Manan Tuli
 * @version 2020-10-30
 */
public abstract class Employee
{
    private String name;
    private int age;
    private int salary;
    private String designation;
    
    protected void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        name = s.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(s.nextLine());
        System.out.println("Enter salary: ");
        salary = Integer.parseInt(s.nextLine());
        System.out.println("Enter designation: ");
        designation = s.nextLine();
    }
    
    protected void printDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
    
    public static void main(String[] args)
    {
        Doctor[] doctors = new Doctor[3];
        Engineer[] engineers = new Engineer[3];
        Pilot[] pilots = new Pilot[3];
        
        // Initialize array of doctors
        for (int i=0; i<3; i++) {
            doctors[i] = new Doctor();
            doctors[i].getDetails();
        }
        // Initialize array of engineers
        for (int i=0; i<3; i++) {
            engineers[i] = new Engineer();
            engineers[i].getDetails();
        }
        // Initialize array of pilots
        for (int i=0; i<3; i++) {
            pilots[i] = new Pilot();
            pilots[i].getDetails();
        }

        // Print all the employee details
        for (int i=0; i<3; i++) {
            doctors[i].printDetails();
        }
        
        for (int i=0; i<3; i++) {
            engineers[i].printDetails();
        }
        
        for (int i=0; i<3; i++) {
            pilots[i].printDetails();
        }
    }
}
