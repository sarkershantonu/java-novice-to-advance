package org.practice.cor.tasks;

public class Task {
	private int myValue;
	private String description;
	public Task(int value, String des) {
		myValue = value;
		description = des;		
	}	
	public int getValue()
	{
		return myValue;
	}
	public String getDescription(){
		return description;
	}
}
