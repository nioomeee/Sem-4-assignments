// Write a program in Java in which a subclass constructor invokes the constructor of the
// super class and instantiate the values.
class superClass {
    int num1;

    public superClass(int val) {
        num1 = val;
    }
}

class subClass extends superClass {
    int num2;
    public subClass(int val1, int val2) {
        super(val1);
        num2 = val2;
    }

    public void display() {
        System.out.println("1st number = " + num1);
        System.out.println("2nd number = " + num2);
    }
}

public class q7 {
    public static void main(String[] args) {
        subClass sub = new subClass(5, 85);

        sub.display();
    }
}