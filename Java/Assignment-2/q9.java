// Write a Java program to search an element in an array

import java.util.Scanner;
public class q9 {
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
        int val;
        System.out.print("Enter the value you want to find in the array: ");
        val = sc.nextInt();
        sc.close();

        if(findValue(arr, val) == -1){
            System.out.println("The entered value "+val+" is not found in the entered array");
        }else{
            System.out.println("The entered value "+val+" is found in the entered array at "+findValue(arr, val)+" index");
        }
    }

    static int findValue(int[] arr, int val){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
}
