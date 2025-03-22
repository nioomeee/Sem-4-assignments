// Write a Java program to create an interface area having pie as its data members and a
// method compute(float, float)

interface circle {
    double Pi = Math.PI;

    double compute(float a, float b);
}

class Area implements circle {
    @Override 
    public double compute(float rad, float h) {
        return Pi * rad * h;
    }
}

public class q11 {
    public static void main(String[] args) {
        Area area = new Area();

        System.out.println("area of circk=lr with height 5cm and rad 7 cm = " + area.compute(5, 7));
    }
}
