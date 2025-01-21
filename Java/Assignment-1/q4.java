// Write a Java Program that will accept a number from the user and calculate
// its square and cube and display the same.
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Enter a Number: ");
        n = sc.nextDouble();
        display(n);
        sc.close();
    }

    static void display(double n){
        double sq = Math.pow(n, 2);
        double cb = Math.pow(n, 3);

        System.out.println("The Square of "+n+" = "+sq);
        System.out.println("The Cube of "+n+" = "+cb);
    }
}
