package org.practice.threading.processors;

import org.practice.threading.services.Communication;

public class CustomerSupport implements Runnable {
    private String name = "";
    private Communication chat;
    private Thread localThread;

    public Communication getChat() {
        return chat;
    }

    public CustomerSupport(String name, Communication chat) {
        this.name = name;
        this.chat = chat;
        localThread = new Thread(this, String.valueOf(name));
        localThread.start();
    }
    public void run() {
        doWork();
    }
    private String[] replys={"hi, how may I help you?","Thank you, Same to you","yes , I am ready"};
    private void doWork(){
        System.out.println("CustomerSupport:"+ name +" started");
        try {
            for(String s:replys)
                chat.reply(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
