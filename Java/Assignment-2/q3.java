// Write a Java program to remove the duplicate elements of a given array and return the
// new length of the array.
// Example array: [20, 20, 30, 40, 50, 50, 50]
import java.util.Scanner;
import java.util.ArrayList;
public class q3 {
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
        
        Length(arr);
        sc.close();
    }
    static void Length(int[] arr){
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }
        
        System.out.println("the array after removing duplicates: ");
        for(int i = 0; i < uniqueList.size(); i ++){
            System.out.println("[" + i + "] = " + uniqueList.get(i));
        }

        System.out.println("The size of the array after removing duplicates = "+uniqueList.size());
    }
}
