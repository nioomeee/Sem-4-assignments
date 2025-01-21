// Write a Java program to create an array with 10 elements and sort it.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class q4 {
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

        System.out.println("Entered values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
        
        Sorter(arr);
        sc.close();
    }

    static void Sorter(int[] arr){
        // using bubble sort
        // int temp = -1;
        // for(int i = 0; i < arr.length; i ++){
        //     for(int j = i + 1; j < arr.length; j++){
        //         if(arr[i] > arr[j]){
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        //using collections
        ArrayList<Integer> alist = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            alist.add(arr[i]);
        }

        Collections.sort(alist);
        System.out.println("The sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println("["+i+"] = "+alist.get(i));

        }
    }
}
