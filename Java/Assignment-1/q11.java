// Write a Java program to enter two numbers and find the smallest out of them.
// Use conditional operator.
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("The maximum number from the 2  = "+max(a, b)); 
        sc.close();
    }
    static int max(int a, int b){
        return ( a > b ) ? a : b;
    }
}
