// Write a Java Program that take one number from user making use of
// JoptionPane class, pass it to the parameterised Constructor and check
// whether its Odd number or Even number.
import java.util.Scanner;
import javax.swing.JOptionPane;
public class q7 {
    q7(int num){
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = JOptionPane.showInputDialog(
            null,
            "Enter a number",
            "OddEvenChecker",
            JOptionPane.INFORMATION_MESSAGE);
        
            q7 obj = new q7(Integer.parseInt(num));
            sc.close();
    }
}
