import java.util.Scanner;
/**
 * Class OddValues
 *
 * @author Manan Tuli
 * @version 2020-10-13
 */
public class OddValues {
    static int[] a = new int[5];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five integers:");
        for (int i=0; i<5; i++) {
            a[i] = s.nextInt();
        }
        
        System.out.println("The odd values are: ");
        for (int i=0; i<5; i++) {
            if (a[i]%2 == 1) {
                System.out.println(a[i]);
            }
        }
    }
}
