// Write a java Program to remove duplicate element in an Array.
import java.util.Scanner;
import java.util.ArrayList;
public class q2 {
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

        int[] newArray = removeDuplicates(arr);
        System.out.println("Array after removing the duplicates: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("[" + i + "] = " + newArray[i]);
        }
        sc.close();
    }
    static int[] removeDuplicates(int[] arr){
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            if(!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }

        int[] result = new int[uniqueList.size()];
        for(int i = 0; i < uniqueList.size(); i ++){
            result[i] = uniqueList.get(i);
        }

        return result;
    }
}
