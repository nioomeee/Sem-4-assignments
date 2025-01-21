// Write a Java Program to Check Whether a Number is Palindrome or Not
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        Palindrome(num);
        sc.close();
    }

    static void Palindrome(int num){
        int n = num;
        int rem = 0;
        int rev = 0;

        while(n != 0){
            rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }

        if(rev == num){
            System.out.println("The number "+num+" is a palidrome");
        }else{
            System.out.println("The number "+num+" is not a palidrome");
        }
    }
}
