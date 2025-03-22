// Define a class MotorVehicle to take modelName, modelNumeber, modelPrice, and a
// method display() to display these details. Create another class Car which inherits the
// class MotorVehicle and has the member discountRate and having display() method to
// display details. Test this class with suitable constructor. If necessary use the super
// keyword.
class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    public MotorVehicle (String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public void display () {
        System.out.println("Model number  = " + modelNumber);
        System.out.println("Model name  = " + modelName);
        System.out.println("Model price  = " + modelPrice);
    }
}

class Car extends MotorVehicle {
    double discountRate;

    public Car (String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Discount Rate = " + discountRate);
    }
}

class q1{
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", 1546, 255000.54, 0.30);
        myCar.display();
    }
}