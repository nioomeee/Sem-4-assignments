// Write a Java Program to create an array containing marks of all students in physics using
// a for-each loop.
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        System.out.print("Enter the size of the array: ");
        len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the values for the indices: ");
        for (int i = 0; i < len; i++) {
            System.out.print("[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        displayMarks(arr);
        sc.close();
    }

    static void displayMarks(int[] arr){
        int count = 0;
        System.out.println("The entered values fot the array are: ");
        for(int i: arr){
            System.out.println("["+count+"] = "+i);
            count++;
        }
    }
}
