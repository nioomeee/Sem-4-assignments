// Write a Java Program to find area of a circle.
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad;
        System.out.print("Enter the radius of the circle: ");
        rad = sc.nextDouble();

        double area = calculateArea(rad);

        System.out.println("The area os the circle with radius "+rad+" = "+area);
        sc.close();
    }

    static double calculateArea(double rad){
        double area = Math.PI * Math.pow(rad, 2);
        return area;
    }
}
