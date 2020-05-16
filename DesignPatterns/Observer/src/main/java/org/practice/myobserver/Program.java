package org.practice.myobserver;


import org.practice.myobserver.observable.NewsAgency;
import org.practice.myobserver.observer.EmailService;
import org.practice.myobserver.observer.SMSService;

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
