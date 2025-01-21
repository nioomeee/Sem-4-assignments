// Write a Java program to create LinkedList and display them.
import java.util.Scanner;
import java.util.LinkedList;
public class q12 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int len;

        System.out.print("Enter the required length of the linked list: ");
        len = sc.nextInt();

        System.out.println("Enter the values: ");
        int val;
        for(int i = 0; i < len; i ++){
            System.out.print("[" + (i+1)+ "]: ");
            val = sc.nextInt();
            list.add(val);
        }

        System.out.println("The linked list :");
        System.out.println(list.toString());
        sc.close();
    }
}
