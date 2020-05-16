package org.practice.memento;

public class Originator {
	private String state = "Originator state";
	public void set(String aState){
		state=aState;
		System.out.println("State from originator: "+state);
	}
	public Memento store(){
		System.out.println("memento created from originator");
		return new Memento(state);
	}
	public String restore(Memento aMemento){
		System.out.println("memento set from originator");
		state = aMemento.getState();
		return state;
	}
}
