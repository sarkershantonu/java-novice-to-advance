package org.practice.threading.processors;

import java.util.concurrent.Semaphore;

public class SemaphoreProcessor implements Runnable {
    private Semaphore semaphore;
    private String name = "";
    private Thread localThread;

    public SemaphoreProcessor(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        localThread = new Thread(this, this.name);
        localThread.start();
    }

    @Override
    public void run() {
        try {
           if (semaphore.availablePermits() > 0) {
               System.out.println(name + " is locking ");
               System.out.println("Available permits before accure : " + semaphore.availablePermits());
               semaphore.acquireUninterruptibly();
               work();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name + " is releasing ");
            semaphore.release();
            System.out.println("Available permits after release : " + semaphore.availablePermits());
        }
    }

    private void work() throws InterruptedException {
        System.out.println("This is work for " + name);
        Thread.sleep((100 - Integer.valueOf(name)) * 1000);
        System.out.println("Work DONE for " + name);
    }
}
