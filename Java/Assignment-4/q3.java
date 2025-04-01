import java.util.Scanner;

class NotEnough extends Exception {
    NotEnough(String msg) {
        super(msg);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int len = sc.nextInt();

        try{
            if(len <= 2) {
                throw new NotEnough("Not enough elements in the array");
            }
        } catch (NotEnough e) {
            System.out.println(e);
        } 

        int[] arr = new int[len];

        int min = 100;
        int sec_min = 90;
        int val;

        for(int i = 0; i < len; i ++) {
            System.out.print("ENter value " + i + ": ");
            val = sc.nextInt();
            arr[i] = val;
        }

        for(int i = 0; i < len; i ++) {
            if(arr[i] < min){
                sec_min = min;
                min = arr[i];
            } else if(arr[i] < sec_min && arr[i] != min) {
                sec_min = arr[i];
            }
        }


    }
}
