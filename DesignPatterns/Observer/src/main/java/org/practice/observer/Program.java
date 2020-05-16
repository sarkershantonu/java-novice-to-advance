package org.practice.observer;


import org.practice.observer.products.NewsAgency;
import org.practice.observer.services.EmailService;
import org.practice.observer.services.SMSService;

public class Program {

	public static void main(String[] args) {
		System.out.println("Current News is : Bla Bla bla");
		NewsAgency myAgency = new NewsAgency();
		SMSService sms = new SMSService();
		EmailService email = new EmailService();
		myAgency.attachAObserver(sms);
		myAgency.attachAObserver(email);
		myAgency.addNews("shantonu is coading");
		myAgency.notifyAllOvservers();
		
	}

}
