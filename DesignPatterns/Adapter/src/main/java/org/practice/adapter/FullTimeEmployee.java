package org.practice.adapter;

public class FullTimeEmployee implements Employee {
	private String name;

	public String getName() {
		return name;
	}

	public FullTimeEmployee(String aName){
		name=aName;
	}
	
	public void attenOffice() {
		System.out.println(name+" is in office now");	
	}

	public void joinMeeting() {
		System.out.println(name+" is joining today's meeting");	
		
	}
	public void getDailyReport() {
		System.out.println(name+" is providing reports for today");	
	}

}
