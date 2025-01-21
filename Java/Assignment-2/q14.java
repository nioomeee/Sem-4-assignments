// Create a Priority queue with 10 elements and print the minimum value out of it.
import java.util.PriorityQueue;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(); //same syntax as of arraylist and linkedlist

        int len;

        System.out.print("Enter the no of elements you want: ");
        len = sc.nextInt();
        
        int val;

        System.out.println("Enter the values for the stack: ");
        for(int i = 0; i < len; i ++){
            System.out.print("[" + (i+1)+ "]: ");
            val = sc.nextInt();
            queue.add(val); //add used in queues not push
        }

        System.out.println("The entered values are: ");
        
        //will display in ascending order as queues arrange in ascending order
        System.out.println(queue.toString());

        //automatically arranged in ascending order so the peek i.e. 
        // the 1st element will be the smallest in the queue i.e. peek

        System.out.println("The minimum value from the stack = " + queue.peek());
        
        sc.close();
    }
}
