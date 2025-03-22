// Write an interface called Numbers with a method int process(int x,int y). Write a class
// called Sum in which the process() method finds the sum of two numbers and returns an
// int value. Write another class called Average in which the process() method finds the
// average of the two numbers and returns an int value.

interface Numbers {
    int process(int x, int y);
}

class Sum implements Numbers {
    @Override
    public int process(int x, int y) {
        return x + y;
    } 
}

class Average implements Numbers {
    @Override
    public int process(int x, int y) {
        return (x + y) / 2;
    }
}

public class q5 {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Average avg = new Average();

        System.out.println("The sum of 5 and 15 = " + sum.process(5, 15));
        System.out.println("The average of 5 and 15 = " + avg.process(5, 15));
    }
}
