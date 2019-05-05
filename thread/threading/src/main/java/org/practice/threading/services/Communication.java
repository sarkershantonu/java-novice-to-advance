package org.practice.threading;

public class Communication {
    private boolean isAsked = false;

    public synchronized void ask(String question) throws InterruptedException {
        if(isAsked){
            wait();//wait if already asked
        }
        System.out.println(question);
        isAsked =true;
        notify();
    }
    public synchronized void reply(String answers) throws InterruptedException {
        if(!isAsked){
            wait();//waiting for question tobe asked
        }
        System.out.println(answers);
        isAsked =false;
        notify();
    }
}
