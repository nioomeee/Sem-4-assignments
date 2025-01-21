// Write a Java program to create a two-dimensional array and sum all the diagonal elements
// of it.
import java.util.Scanner;
public class q6 {
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
                System.out.print("a["+i+"]["+j+"] = "+arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("The Sum of all the diagonal elements = "+sumDiagonal(arr, rows, cols));
        sc.close();
    }

    static int sumDiagonal(int[][] arr, int rows, int cols){
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j ++){
                if(i == j){
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    }
}
