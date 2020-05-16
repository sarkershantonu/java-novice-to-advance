package org.practice.mediator.products;

import org.practice.mediator.mediator.Mediator;

//Act as Colleague
public abstract class Employee {
	private Mediator mediator;
	private int employeeCode = 0;
	public Employee(Mediator aMeadiator){
		mediator=aMeadiator;
		mediator.addEmployee(this);
	}	
	public void teachingOffer(String subject, int time) {//Teaches
		mediator.giveKnowledge(subject, time, employeeCode);
	}
	public void learningRequests(String subject, int time) {//learns
		mediator.getKnowledge(subject, time, employeeCode);
	}
	public void setEmployeeCode(int code){
		employeeCode=code;
	}
}
