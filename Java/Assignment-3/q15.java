import shapes.areaCalculator;

public class q15 {
    public static void main(String[] args) {
        double recatangleArea = areaCalculator.calculateRectangleArea(15,45);
        double circleArea = areaCalculator.calculateCircleArea(15);
        double squreAre = areaCalculator.calculateSquareArea(15);

        System.out.println("The are of the rectangle = " + recatangleArea);
        System.out.println("The are of the circle = " + circleArea);
        System.out.println("The are of the square = " + squreAre);
    }
}
