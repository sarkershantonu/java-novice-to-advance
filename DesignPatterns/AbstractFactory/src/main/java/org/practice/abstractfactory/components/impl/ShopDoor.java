package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Door;

public class ShopDoor implements Door {
	public ShopDoor(){
		System.out.println("Shop Door is created"); 
	}
	public String toString(){
		return "not designed and has no bell";
	}
}
