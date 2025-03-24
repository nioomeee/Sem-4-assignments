// Write a java program which takes 2 arguments - a string and its length. If the length of
// the string is not according to given one then throw the user defined
// LengthMatchException and handles it appropriately. 
import java.util.Scanner;

class LengthMatchException extends Exception{
    public LengthMatchException(String message) {
        super(message);
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter length of the string: ");
        int len = sc.nextInt();

        try {
            if(str.length() != len) {
                throw new LengthMatchException("Length of the string doesn't match the entered length");
            }

            System.out.println("String = " + str);
            System.out.println("Expected length = " + len);
        } catch (LengthMatchException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
   
    }
}
