package org.practice.threading.apps;

import org.practice.threading.processors.SemaphoreProcessor;
import org.practice.threading.processors.SemaphoreThread;

import java.util.concurrent.Semaphore;

public class SemaphoreApp {
    public static void main(String[] args) {
        testSemaphoreThreads();
    }
    public static void testSemaphoreRunnable(){
        Semaphore semaphore = new Semaphore(3);
        for(int i =1; i<=10;i++){
            new SemaphoreProcessor(semaphore,String.valueOf(i));
        }
    }
    public static void testSemaphoreThreads(){
        Semaphore semaphore = new Semaphore(5);
        for(int i =1; i<=50;i++){
            new SemaphoreThread(semaphore,String.valueOf(i)).start();
        }
    }
}
