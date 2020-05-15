package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Furniture;

public class ShopFurniture implements Furniture {
	public ShopFurniture(){
		System.out.println("Shop furniture is created"); 
	}
	public String toString(){
		return "Free basic Furniture";
	}
}
