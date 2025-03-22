package shapes;

public class areaCalculator {
    public static double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateSquareArea(double side){
        return side * side;
    }
}