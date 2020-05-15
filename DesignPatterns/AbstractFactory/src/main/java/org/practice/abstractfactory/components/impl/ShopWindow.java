package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Window;

public class ShopWindow implements Window {
	public String toString(){
		return "Size 40";
	}
	public ShopWindow(){
		System.out.println("Shop Window is created");
	}
}
