// Write a Java Program to create an array with 10 elements and find Smallest Number from
// it.
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i ++){
            System.out.print("Enter the value for index "+i+" : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Entered values are: ");
        for(int i = 0; i < arr.length; i ++){
            System.out.println("["+i+"] = "+arr[i]);
        }

        System.out.println("The smallest number from the entered array = "+Smallest(arr));
        sc.close();
    }

    static int Smallest(int[] arr){
        int small = arr[0];
        for(int i : arr){
            if(i < small){
                small = i;
            }
        }
        return small;
    }
}
