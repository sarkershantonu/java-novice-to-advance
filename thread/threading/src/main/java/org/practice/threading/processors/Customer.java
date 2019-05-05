package org.practice.threading;

public class Customer implements Runnable {
    private String name ="";
    private Communication chat;
    private Thread localThread;

    public void setName(String name) {
        this.name = name;
    }

    public Communication getChat() {
        return chat;
    }



    public Customer(String name, Communication chat) {
        this.name = name;
        this.chat = chat;
        localThread = new Thread(this, String.valueOf(this.name));
        localThread.start();
    }

    public void run() {
        doWork();
    }
    private String[] ques={"Hello","Good Morning","Can I get some help? "};
    private void doWork(){
        System.out.println("Customer:"+ name +" started");
        try {
            for(String s:ques)
                chat.ask(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
