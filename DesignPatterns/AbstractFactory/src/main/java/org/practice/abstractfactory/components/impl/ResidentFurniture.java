package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Furniture;

public class ResidentFurniture implements Furniture {
	public ResidentFurniture(){
		System.out.println("Resident furniture is created"); 
	}
	public String toString(){
		return "Full Free Furniture";
	}
}
