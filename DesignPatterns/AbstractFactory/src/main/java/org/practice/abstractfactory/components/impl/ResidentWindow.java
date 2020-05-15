package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Window;

public class ResidentWindow implements Window {
	public String toString(){
		return "Size 10";
	}
	public ResidentWindow(){
		System.out.println("Resident window is created");
	}
}
