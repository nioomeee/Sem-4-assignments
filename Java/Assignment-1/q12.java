// Write a Java Program to Find the Largest Number Among three Numbers
// Entered by User using nested if-else and if-else ladder.
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 1st number: ");
       int a = sc.nextInt();
       System.out.print("Enter 2nd number: ");
       int b = sc.nextInt();
       System.out.print("Enter 3rd number: ");
       int c = sc.nextInt();
       int num = Nested(a, b, c);
       System.out.println("The kargest of the 3 umbers using nested if else = "+num);
       num = Ladder(a, b, c);
       System.out.println("The kargest of the 3 umbers using if else Ladder= "+num);
       sc.close(); 
    }

    static int Nested(int a, int b, int c){
        int num = a;
        if(a > b){
            if(a > c){
                num = a;
            }
        }else if(b > a){
            if(b > c){
                num = b;
            }
        }else{
            num = c;
        }

        return num;
    }

    static int Ladder(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
