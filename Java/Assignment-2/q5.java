// Write a J ava program to create a two-dimensional array and find the minimum value out
// of it.
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.print("Enter the rows of the array: ");
        rows = sc.nextInt();
        System.out.print("Enter the cols of the array: ");
        cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the values for the indices: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j ++){
                System.out.print("a["+i+"]["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Entered values are: ");
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j ++){
                System.out.print("a["+i+"]["+j+"] = "+arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The minimum values from the array = "+findMin(arr, rows, cols));

    }

    static int findMin(int[][] arr, int rows, int cols){
        int min = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j ++){
               if(min > arr[i][j]){
                min = arr[i][j];
               }
            }
        }
        return min;
    }
}
