// Write a java program to create two threads. One using runnable interface and other by
// extending thread. First thread will print all odd numbers and second will print all even
// numbers between 1 to 10.
class thread1 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 50; i+=2) {
            System.out.print(i + " ");
            try {
                thread1.sleep(500);
            } catch(Exception e) {
                System.out.println("Exception thread1");
            }
        }
    }
}

class thread2 implements Runnable {
    @Override
    public void run() {
        for(int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception thread 2");
            }
        }
    }
}
public class q5 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();

        t1.start();
        Thread t2 = new Thread(new thread2());
        t2.start();

    }
}
