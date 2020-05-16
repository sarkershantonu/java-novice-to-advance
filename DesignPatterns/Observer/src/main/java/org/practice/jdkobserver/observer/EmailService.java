package org.practice.jdkobserver.observer;

import java.util.Observable;
import java.util.Observer;

public class EmailService implements Observer{
	public void update(Observable arg0, Object arg1) {
		String data = (String)arg1;
		System.out.println("I have notified by Email : "+data);
	}
}
