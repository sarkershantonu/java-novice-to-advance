package org.practice.myobserver.observer;

public class EmailService implements MyObserver{

	public void update() {
		System.out.println("I have notified by Email : ");
	}

	public void update(Object args) {
		String data = (String)args;
		System.out.println("I have notified by Email : "+data);
	}
}
