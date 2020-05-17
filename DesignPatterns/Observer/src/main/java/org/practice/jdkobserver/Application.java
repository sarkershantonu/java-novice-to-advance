package org.practice.jdkobserver;


import org.practice.jdkobserver.observable.NewsAgency;
import org.practice.jdkobserver.observer.EmailService;
import org.practice.jdkobserver.observer.SMSService;

public class Application {

	public static void main(String[] args) {
		System.out.println("Current News is : Bla Bla bla");
		NewsAgency myAgency = new NewsAgency();
		SMSService sms = new SMSService();
		EmailService email = new EmailService();
		myAgency.addObserver(sms);
		myAgency.addObserver(email);
		myAgency.addNews("shantonu is coading");
		myAgency.notifyObservers();
		
	}

}
