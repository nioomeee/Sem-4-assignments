// Create a class with a method that prints "This is parent class" and its subclass with
// another method that prints "This is child class". Now, create an object for each of the
// class and call -
//  method of parent class by object of parent class
//  method of child class by object of child class
//  method of parent class by object of child class
class Parent {
    public void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is child class");
    }
}
public class q9 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.displayParent();
        child.displayChild();
        child.displayParent();
    }
    
}
