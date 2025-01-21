// Write a Java program to calculate gross salary and net salary of an employee.
//  Gross salary = Hourly rate * total number of hours worked
//  Net salary = gross salary - tax (7.5%)
// Take values from users using Scanner class.
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hourly rate in dollars: ");;
        float rate = sc.nextFloat();

        System.out.print("Enter your no. of hours worked: ");;
        int hours = sc.nextInt();

        calculateSalary(rate, hours);
        
        sc.close();
    }

    static void calculateSalary(float rate, int hours){
        double GrossSalary = hours * rate;
        double tax = (7.5 / 100) * GrossSalary;
        double netSalary = GrossSalary - tax;
        System.out.println("The Gross salary = "+GrossSalary);
        System.out.println("The Net salary = "+netSalary);
    }
}
