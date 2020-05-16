package org.practice.observer.services;

import java.util.Observable;
import java.util.Observer;

public class EmailService implements MyObserver{

	public void update() {

	}

	public void update(Object args) {
		String data = (String)args;
		System.out.println("I have notified by Email : "+data);
	}
}