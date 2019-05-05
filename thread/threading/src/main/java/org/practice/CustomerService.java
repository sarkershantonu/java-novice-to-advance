package org.practice;

public class CustomerService implements Runnable {
    private String name = "";
    private Communication chat;
    private Thread localThread;

    public Communication getChat() {
        return chat;
    }

    public CustomerService(String name, Communication chat) {
        this.name = name;
        this.chat = chat;
        localThread = new Thread(this, String.valueOf(name));
        localThread.start();
    }
    public void run() {
        doWork();
    }
    private String[] replys={"hi","how are you?","yes , I am ready"};
    private void doWork(){
        System.out.println("CustomerService:"+ name +" started");
        try {
            for(String s:replys)
                chat.reply(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
