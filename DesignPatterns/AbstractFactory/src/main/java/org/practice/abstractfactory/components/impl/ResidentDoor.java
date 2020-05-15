package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Door;

public class ResidentDoor implements Door {
	public ResidentDoor(){
		System.out.println("Resident Door is created"); 
	}
	public String toString(){
		return "designed and has bell";
	}

}
