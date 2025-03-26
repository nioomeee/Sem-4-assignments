// Write a program to calculate the area of circle, Rectangle & Square by using interface.
import java.util.Scanner;

interface Area {
    double calculateArea();
}

class Circle implements Area {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Area {
    double length, breadth;

    public Rectangle(double len, double bred) {
        length = len;
        breadth = bred;
    }

    @Override 
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Area {
    double side;

    public Square(double len) {
        side = len;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double rad = sc.nextDouble();
        Circle circle = new Circle(rad);
        System.out.println("The Area of the circle = " + circle.calculateArea());

        System.out.print("Enter the length of the recatngle: ");
        double len = sc.nextDouble();
        System.out.print("Enter the breadth of the recatngle: ");
        double bre = sc.nextDouble();
        Rectangle rectangle = new Rectangle(len, bre);
        System.out.println("The Area of the rectangle = " + rectangle.calculateArea());

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);
        System.out.println("The Area of the square = " + square.calculateArea());

        sc.close();
    }
}