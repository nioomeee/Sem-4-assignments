// Write a Java program to reverse a number.
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("The reverse number of "+num+" = "+Reverse(num));
        sc.close();
    }
    static int Reverse(int num){
        int n = num;
        int rev = 0;
        int rem = 0;
        while(n != 0){
            rem = n % 10;
            rev = (rev * 10)+rem;
            n = n /10;
        }
        return rev;
    }
}
