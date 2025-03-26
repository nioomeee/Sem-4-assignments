// Write a program that executes two threads. One thread displays Thread1 every 2,000
// milliseconds, and the other displays 'Thread2' every 4,000 milliseconds. Create the
// threads by extending the Thread class.

class Thread1 extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Thread 1");
            try {
                Thread1.sleep(2000);
            } catch(Exception e) {
                System.out.println("exception thread1");
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println("Thread 2");
            try {
                Thread2.sleep(4000);
            } catch(Exception e) {
                System.out.println("exception thread1");;
            }
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
    }
}
