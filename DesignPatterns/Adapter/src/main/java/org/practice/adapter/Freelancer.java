package org.practice.adapter;


public class Freelancer {
	private String name; 
	public String getName() {
		return name;
	}
	public void startWork(){
		System.out.println(name+" has started work remotely");	
	}
	public void remoteConversation(){
		System.out.print("\n"+name + " has started remote conversation");
	}
	public void getReport(String aDate){
		System.out.println(name+" is providing reports for "+aDate);
	}
	public Freelancer(String aName){
		name=aName;
	}
}
