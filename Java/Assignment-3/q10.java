// Write a Java Program to create a simple class to find out the Area and perimeter of
// rectangle and box using super and this keyword.
class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int calculateArea() {
        return length * breadth;
    }
}

class Box extends Rectangle {
    int height;

    public Box(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    @Override 
    public int calculateArea() {
        return super.calculateArea() * height;
    }
}
public class q10 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Box box = new Box(5, 10, 15);

        System.out.println("Area of rectangle = " + rect.calculateArea());
        System.out.println("Area of box = " + box.calculateArea());
    }
}   
