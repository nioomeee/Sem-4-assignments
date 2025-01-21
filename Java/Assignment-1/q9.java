// Write a Java Program that calculate area of triangle using Constructor. Also
// find area of rectangle using Constructor Overloading.
import java.util.Scanner;
public class q9 {
    q9(double base, double height){
        double area = (0.5 * base * height);
        System.out.println("The area of the triangle = "+area);
    }
    q9(int l, int b){
        int area = (l*b);
        System.out.println("The area of the rectangle = "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("For triangle ----------------------------------");
        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        q9 obj1 = new q9(base, height);
        int length, breadth;
        System.out.println("For rectangle ----------------------------------");
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextInt();
        System.out.print("Enter the height of the triangle: ");
        length = sc.nextInt();
        q9 obj2 = new q9(length, breadth);

        sc.close();
    }
}
