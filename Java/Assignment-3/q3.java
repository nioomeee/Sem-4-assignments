// Write a program to calculate arithmetic mean in the superclass and standard deviation in
// the subclass.

class arithmeticMean {
    public double calculateMean(int[] nos) {
        double sum = 0;
        for(int num : nos) {
            sum += num;
        }

        return sum / nos.length;
    }
}

class standardDeviation extends arithmeticMean {
    public double calculateSD(int[] nos) {
        double mean = calculateMean(nos);
        double sum = 0;
        
        for(int num : nos) {
            
            sum += Math.pow(num-mean, 2);
        }

        return Math.sqrt(sum / nos.length);
    }
}

public class q3 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        standardDeviation Sd = new standardDeviation();

        System.out.println("Mean: " + Sd.calculateMean(data));
        System.out.println("Standard deviation = " + Sd.calculateSD(data));
    }
}