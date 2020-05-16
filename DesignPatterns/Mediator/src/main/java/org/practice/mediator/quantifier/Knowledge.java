package org.practice.mediator.quantifier;

public class Knowledge {
	private String subject="Not Selected";
	private int hour=0;
	private int employeeCode=0;
	public Knowledge(String sub, int hr, int code){
		subject=sub;
		hour = hr;
		employeeCode=code;
	}
	public String getSubject() {
		return subject;
	}
	public int getHour() {
		return hour;
	}
	public int getEmployeeCode() {
		return employeeCode;
	}
}
