
package vu.balex;
import java.util.Scanner;
public class bankBukoto2 {
    
     public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = save.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = save.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = save.nextInt();

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("\nProduct\tSum\tMaximum");
        System.out.printf("%d\t%d\t%d\n", product, sum, max);

        
    }
}
    

