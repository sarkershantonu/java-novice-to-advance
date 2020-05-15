package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Door;

public class OfficeDoor implements Door {
	public OfficeDoor(){
		System.out.println("Office Door is created"); 
	}
	public String toString(){
		return "designed but no bell";
	}
}
