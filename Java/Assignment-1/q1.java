// Perform all the arithmatic operations using all four types of functions and
// display the same.
import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        NANR();
        int sum = NAWR();
        System.out.println("a + b = "+ sum);
        WANR(a,b);
        sum = WAWR(a,b);
        System.out.println("a + b = "+ sum);
        sc.close();
    }

    static void NANR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("a + b = "+ (a+b));
        sc.close();
    }

    static int NAWR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        sc.close();
        return (a+b);
    }

    static int WAWR(int a, int b){
        return a+b;
    }

    static void WANR(int a, int b){
        System.out.println("a + b = "+(a+b));
    }
}