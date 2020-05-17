package org.practice.myobserver.observer;

public class SMSService implements MyObserver{


	public void update() {
		System.out.println("I have notified by SMS : ");
	}

	public void update(Object args) {
		String data = (String)args;
		System.out.println("I have notified by SMS : "+data);
	}
}
