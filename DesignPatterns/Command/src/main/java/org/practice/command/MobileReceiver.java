package org.practice.command;

public class MobileReceiver implements Reciever {

	private int vol = 0;
	public void home() {
		System.out.println("You are now at Home Screen");		
	}
	public void on() {
		System.out.println("Mobile is turning on");		
	}
	public void off() {
		System.out.println("Mobile is turning off");		
	}
	public void volumeUp() {
		vol++;
		System.out.println("The volume is up to "+vol);		
	}
	public void volumeDowne() {
		vol--;
		System.out.println("The volume is down to "+vol);		
	}
	public void back() {
		System.out.println("Going Back...");
	}
}
