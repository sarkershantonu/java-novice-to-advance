package org.practice.threading.processors;

import java.util.concurrent.Semaphore;

public class SemaphoreThread extends Thread {
    private Semaphore semaphore;
    private String name = "";

    public SemaphoreThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        boolean isAccuire = true;
        try {
            if (semaphore.availablePermits() > 0) {
                System.out.println(name + " is locking ");
                System.out.println("Available permits before accure : " + semaphore.availablePermits());
                semaphore.acquireUninterruptibly();
                isAccuire = true;
                work();

            } else {
                System.out.println("cant work .. :(  for : " + this.name);
                isAccuire = false;
                wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (isAccuire) {
                System.out.println(name + " is releasing ");
                semaphore.release();
                System.out.println("Available permits after release : " + semaphore.availablePermits());
                notifyAll();
            }

        }
    }

    private void work() throws InterruptedException {
        System.out.println("This is work for " + name);
        Thread.sleep((50 - Integer.valueOf(name)) * 1000);
        System.out.println("Work DONE for " + name);
    }
}
