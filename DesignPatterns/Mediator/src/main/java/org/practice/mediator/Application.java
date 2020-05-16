package org.practice.mediator;

import org.practice.mediator.mediator.SchoolingMediator;
import org.practice.mediator.products.Administrators;
import org.practice.mediator.products.Developer;
import org.practice.mediator.products.Testers;

public class Application {
	public static void main(String[] args) {
		SchoolingMediator kazSchool = new SchoolingMediator();
		Developer myDevs = new Developer(kazSchool);
		Testers myTesters = new Testers(kazSchool);
		Administrators myAdmins = new Administrators(kazSchool);
		
		myDevs.learningRequests("QTP", 5);//learning qtp for 5 hours
		myDevs.learningRequests("SVN Administration", 2);//learning SVN administration for 2 hours
		myDevs.teachingOffer("Unit Testing", 1);
		myDevs.teachingOffer("Java", 20);
		myDevs.teachingOffer("c#", 20);
		
		myTesters.learningRequests("Java", 20);
		myTesters.learningRequests("c#", 10);
		myTesters.teachingOffer("QTP", 5);
		myTesters.teachingOffer("Selenium", 5);
		myTesters.teachingOffer("Session Hacking", 5);
		
		myAdmins.learningRequests("Session Hacking", 5);
		myAdmins.learningRequests("Unit Testing", 1);
		myAdmins.teachingOffer("SVN Administration", 2);
		myAdmins.teachingOffer("Linux Administration", 10);
		kazSchool.getAllTrainings();
	}
}
