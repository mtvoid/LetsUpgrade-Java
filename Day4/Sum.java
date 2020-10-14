import java.util.Scanner;
/**
 * Class Sum
 *
 * @author
 * @version
 */
public class Sum {    
    public static void main(String[] args){
        int[] a = new int[5];
        int sum=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter five integers:");
        for (int i=0; i<5; i++) {
            a[i] = s.nextInt();
        }
        
        for (int i=0; i<5; i++) {
            sum += a[i];
        }
        
        System.out.println("The sum of all the integers is " + sum);
    }
}
