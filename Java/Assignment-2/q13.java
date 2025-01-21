// Create a stack with 5 elements and find the minimum value out of it.
import java.util.Stack;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(); //same syntax as of arraylist and linkedlist

        int len;

        System.out.print("Enter the no of elements you want: ");
        len = sc.nextInt();
        
        int val;

        System.out.println("Enter the values for the stack: ");
        for(int i = 0; i < len; i ++){
            System.out.print("[" + (i+1)+ "]: ");
            val = sc.nextInt();
            stack.push(val); //push used in stack not add
        }

        System.out.println("The entered values are: ");
        
        System.out.println(stack.toString());

        int min = stack.peek(); //peek is for last element which will be at the top of the stack
        for(int el: stack){
            if(min > el){
                min = el;
            }
        }

        System.out.println("The minimum value from the stack = "+min);
        
        sc.close();
    }
}
