// Write a Java program that will convert length in feet to centimeters using
// copy constructor. And print both the values. [before conversion and after
// conversion]
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet;
        System.out.print("Enter the length in feet: ");
        feet = sc.nextDouble();
        LengthConverter obj = new LengthConverter(feet);
        System.out.println("Original conversion");
        obj.display();

        LengthConverter copy = new LengthConverter(obj);
        System.out.println("Copied conversion");
        copy.display();
        sc.close();
    }
}

class LengthConverter{
    private double feet;
    private double centi;

    //constructor for initializing feet
    public LengthConverter(double feet){
        this.feet = feet;
        this.centi = feetToCenti(feet);
    }
    // Copy constructor
    public LengthConverter(LengthConverter obj){
        this.feet = obj.feet;
        this.centi = obj.centi;
    }

    //method to convert feet to centi
    private double feetToCenti(double feet){
        return feet * 30.48;
    }

    // Method to print values
    public void display(){
        System.out.println("Length in feet = "+feet);
        System.out.println("Length in centimeters = "+centi);
    }
}