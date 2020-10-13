import java.util.Scanner;
import java.time.*;

/**
 * Class Employee
 *
 * @author Manan Tuli
 * @version 2020-10-10
 */
public class Employee {
    String name;
    int dob,mob,yob,salary,age,tax;
    
    private void getDetails() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        name = s.nextLine();
        System.out.print("Enter " + name + "'s year of birth: ");
        yob = s.nextInt();
        System.out.print("Enter " + name + "'s month of birth: ");
        mob = s.nextInt();
        System.out.print("Enter " + name + "'s day of birth: ");
        dob = s.nextInt();
        System.out.print("Enter " + name + "'s monthly salary: ");
        salary = 12 * s.nextInt();
    }
    
    private void computeAge() {
        LocalDateTime date = LocalDateTime.now();
        if ((date.getMonthValue() < mob) ||
            (date.getMonthValue() == mob) && (date.getDayOfMonth() < dob)) {
            age = date.getYear() - yob - 1;
        }
        else age = date.getYear() - yob;
    }
    
    private void computeTax() {
        tax = 0;
        int taxable;
        int s = salary;
        
        if (s >= 500000) {
            taxable = s - 500000;
            tax += taxable * 0.20;
            s -= taxable;
        }
        if (s >= 400000) {
            taxable = s - 400000;
            tax += taxable * 0.15;
            s -= taxable;
        }
        if (s >= 300000) {
            taxable = s - 300000;
            tax += taxable * 0.10;
            s -= taxable;
        }
        if (s >= 200000) {
            taxable = s - 200000;
            tax += taxable * 0.05;
        }
    }
    
    private void printDetails() {
        System.out.println("Tax report:");
        System.out.println("Employee name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Computed tax: Rs. " + tax);
    }
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getDetails();
        e.computeAge();
        e.computeTax();
        e.printDetails();
    }
}
