ew thread("Thread1 (NORM)");
        thread t3 = new thread("Thread1 (MAX)");

        t1.setPriority(Thread.MIN_PRIORITY); // priority 1
        t2.setPriority(Thread.MAX_PRIORITY); // priority 1
        t3.setPriority(Thread.NORM_PRIORITY); // priority 1

        t1.start();
        t2.start();
        t3.start();