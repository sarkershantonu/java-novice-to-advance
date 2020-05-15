package org.practice.abstractfactory.builders.impl;

import org.practice.abstractfactory.builders.HouseBuilder;
import org.practice.abstractfactory.components.impl.ShopDoor;
import org.practice.abstractfactory.components.impl.ShopFurniture;
import org.practice.abstractfactory.components.impl.ShopToilet;
import org.practice.abstractfactory.components.impl.ShopWindow;
import org.practice.abstractfactory.components.*;

public class ShopBuilder implements HouseBuilder {
	public ShopBuilder(){
		System.out.println("Shop builder is created");
	}
	public Door addDoor() {
		return new ShopDoor();
	}	
	public Window addWindow() {
		return new ShopWindow();
	}
	public Toilet addToilet() {
		return new ShopToilet();
	}
	public Furniture addFurniture() {
		return new ShopFurniture();
	}
}
