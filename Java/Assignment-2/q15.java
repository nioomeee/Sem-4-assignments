// Write a Java program to create an Arraylist with 5 elements and perform following
// operations on it:
// • get()
// • contains()
// • remove()
// • sort()

import java.util.Scanner;
import java.util.ArrayList;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int len;

        System.out.print("Enter the no of elements you want: ");
        len = sc.nextInt();

        int val;

        System.out.println("Enter the values for the array list: ");
        for(int i = 0; i < len; i ++){
            System.out.print("[" + (i+1)+ "]: ");
            val = sc.nextInt();
            list.add(val); //add used in queues not push
        }

        while(true){
            System.out.println("Menu: ");
            System.out.println("1. Print number using it's index");
            System.out.println("2. Check whether number exists in list or not");
            System.out.println("3. Remove any index in the list");
            System.out.println("4. Sort the array list");
            System.out.println("5. Print the array list");
            System.out.println("6. Exit");

            int choice;
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.print("Enter the index you want to find: ");
                int idx = sc.nextInt();

                if(idx > list.size()){
                    System.out.println("Enter a valid index");
                }else{
                    System.out.println("The value at index ["+idx+"] = "+list.get(idx));
                }
                break;

                case 2:
                System.out.print("Enter a number to check whether it exists in the list or not: ");
                int num = sc.nextInt();

                if(!list.contains(num)){
                    System.out.println("The list doesn't contain the given value "+num);
                }else{
                    System.out.println("The list contain the given value "+num);
                }
                break;

                case 3:
                System.out.print("Enter the index you want to remove: ");
                idx = sc.nextInt();
                
                list.remove(idx);

                System.out.println("The list after removing the given index: "+list.toString());
                break;

                case 4:
                list.sort(null);
                System.out.println("The array list after sorting: "+list.toString());
                break;

                case 5:
                System.out.println("The array list = "+list.toString());
                break;

                case 6:
                System.out.println("Exiting the loop");
                System.exit(0);
                break;

                default:
                System.out.println("Enter valid choice ");
            }
        }
    }
}
