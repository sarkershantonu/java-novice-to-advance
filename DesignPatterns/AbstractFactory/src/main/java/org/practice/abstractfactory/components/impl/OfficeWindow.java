package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Window;

public class OfficeWindow implements Window {
	public String toString(){
		return "Size 20";
	}
	public OfficeWindow(){
		System.out.println("Office Window is created");
	}
}
