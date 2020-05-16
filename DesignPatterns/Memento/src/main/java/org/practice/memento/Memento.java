package org.practice.memento;

public class Memento {
	private String state = "Not initiated";
	public Memento(String aState){
		state=aState;
		System.out.println("A memento is created");
	}
	public String getState(){
		System.out.println("State from Memento "+ state);
		return state;		
		}
}
