package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Toilet;

public class ShopToilet implements Toilet {
	public ShopToilet(){
		System.out.println("Shop toilet is created"); 
	}
	public String toString(){
		return "no bathtub and no shawar ";
	}
}
