// Write a program to create three threads. Assign priority to thread. Make a class to test
// them. Also use Sleep method to give pause between them.
class thread extends Thread {
    String name;

    public thread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread Name: " + name + " Priority: " + getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
}

public class q6 {
    public static void main(String[] args) {
        thread t1 = new thread("Thread1 (MIN)");
        thread t2 = new thread("Thread1 (NORM)");
        thread t3 = new thread("Thread1 (MAX)");

        t1.setPriority(Thread.MIN_PRIORITY); // priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}
