import java.util.Scanner;
/**
 * Class Avenger
 *
 * @author Manan Tuli
 * @version 2020-10-13
 */
public class Avenger {
    String name;
    int age;
    String power, weapon, planet;
    
    public void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Avenger's name: ");
        name = s.nextLine();
        System.out.print("Enter age: ");
        age = Integer.parseInt(s.nextLine());
        System.out.print("Enter " + name + "'s planet: ");
        planet = s.nextLine();
        System.out.print("Enter " + name + "'s power: ");
        power = s.nextLine();
        System.out.print("Enter " + name + "'s weapon: ");
        weapon = s.nextLine();
        System.out.println("----- Avenger's data entered. -----");
    }
    
    public void displayDetails() {
        System.out.println("------------");
        System.out.println("Avenger name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Planet: " + planet);
        System.out.println("Power: " + power);
        System.out.println("Weapon: " + weapon);
        System.out.println("------------");
    }
    
    public static void main(String[] args) {
        Avenger[] avengers = new Avenger[5];
        //Create and store data for each Avenger
        for (int i=0; i<5; i++) {
            avengers[i] = new Avenger();
            avengers[i].getDetails();
        }
        
        //Print Avenger details
        for (int i=0; i<5; i++) {
            avengers[i].displayDetails();
        }
    }
}
