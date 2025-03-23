// Write a program to display the sum of digits of given numbers with exception handling.
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        try {
            int num = a;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of digits of the number " + a + " = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number! ");
        } 
        sc.close();
    }
}