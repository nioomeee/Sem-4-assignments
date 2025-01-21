// Write a Java program to sort array elements in desending order.
import java.util.Scanner;
public class q8 {
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
        int[] newArr = Sorter(arr);

        System.out.println("Entered values are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }

        System.out.println("Values arranged in descending order: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("[" + i + "] = " + newArr[i]);
        }
        sc.close();
    }

    static int[] Sorter(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i ++){
            for(int j = i+1; j < arr.length; j ++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
