// Write a Java Program that take user Year as input from user making use of
// JoptionPane class and check whether its leap year or not.
import java.util.Scanner;
import javax.swing.JOptionPane;;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year = JOptionPane.showInputDialog(
            null,
            "Enter the year: ",
            "Leap year checker",
            JOptionPane.INFORMATION_MESSAGE);
        int Year = Integer.parseInt(year);
        checkYear(Year);
        sc.close();
    }

    static void checkYear(int year){
        if(year % 4 == 0 && year % 400 == 0){
            System.out.println("The year "+year+" is a leap year");
        }else{
            System.out.println("The year "+year+" is not a leap year");
        }
    }
}
