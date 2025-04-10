// Write a java program to create 3 threads using Thread class. Three threads should
// calculate the sum of 1 to 5, 6 to 10 and 11 to 15 respectively. After all thread finishes
// main thread should print the sum and average.

class thread extends Thread {
    int start, end, sum;

    public thread (int s, int e) {
        start = s;
        end = e;
        sum = 0;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i ++) {
            sum += i;
        }
        System.out.println("Sum of values from " + start + " to " + end + " = " + sum);
    }

    public int getSum(){
        return sum;
    }
}
public class q7 {
    public static void main(String[] args) {
        thread t1 = new thread(1, 5);
        thread t2 = new thread(6, 10);
        thread t3 = new thread(11, 15);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println("errorrrrrrrrrrrrrrrrrr");
        }

        int total = t1.getSum() + t2.getSum() + t3.getSum();

        System.out.println("Sum = "+ total);
    }
}
