// Write a Java program that will convert the given temperature in fahrenheit to
// celcius using the formula C=(F-32)/1.8
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in farenheit: ");
        double far = sc.nextFloat();
        double cel = Conversion(far);
        System.out.println("The temperature in farenheit = "+far);
        System.out.println("The temperature in celcius = "+cel);
        sc.close();
    }

    static double Conversion(double far){
        double cel = (far - 32) / 1.8;
        return cel;
    }
}
