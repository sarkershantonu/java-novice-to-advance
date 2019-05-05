package org.practice;

public class Customer implements Runnable {
    private int id = 0;
    private Communication chat;
    private Thread localThread;

    public void setId(int id) {
        this.id = id;
    }

    public Communication getChat() {
        return chat;
    }



    public Customer(int id, Communication chat) {
        this.id = id;
        this.chat = chat;
        localThread = new Thread(this, String.valueOf(id));
        localThread.start();
    }

    public void run() {
        doWork();
    }
    private String[] ques={"Hello","Good Morning","Can I get some help? "};
    private void doWork(){
        System.out.println("Customer:"+id+" started");
        try {
            for(String s:ques)
                chat.ask(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
