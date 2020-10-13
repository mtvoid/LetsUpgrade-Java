import java.util.Scanner;
/**
 * Class Grade
 *
 * @author Manan Tuli
 * @version 2020-10-10
 */
public class Grade
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int a,b,c,d,e;
           
        System.out.println("Enter the marks obtained for each subject:");
        System.out.print("English: ");
        a = s.nextInt();
        System.out.print("Mathematics: ");
        b = s.nextInt();
        System.out.print("History: ");
        c = s.nextInt();
        System.out.print("Science: ");
        d = s.nextInt();
        System.out.print("Economics: ");
        e = s.nextInt();
        
        float avg = (float)(a + b + c + d + e)/5;
        char grade;
        
        if (avg >= 85) {
            grade = 'A';
        } else if (avg >= 70) {
            grade = 'B';
        } else if (avg >= 55) {
            grade = 'C';
        } else if (avg >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("The average marks (%) are " + avg);
        System.out.println("The grade is " + grade);
    }
}
