package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Furniture;

public class OfficeFurniture implements Furniture {
	public OfficeFurniture(){
		System.out.println("Office furniture is created"); 
	}
	public String toString(){
		return "Full paid Furniture";
	}
}
