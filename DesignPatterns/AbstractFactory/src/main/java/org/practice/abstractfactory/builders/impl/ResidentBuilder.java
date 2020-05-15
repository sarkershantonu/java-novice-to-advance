package org.practice.abstractfactory.builders.impl;

import org.practice.abstractfactory.builders.HouseBuilder;
import org.practice.abstractfactory.components.impl.ResidentDoor;
import org.practice.abstractfactory.components.impl.ResidentFurniture;
import org.practice.abstractfactory.components.impl.ResidentToilet;
import org.practice.abstractfactory.components.impl.ResidentWindow;
import org.practice.abstractfactory.components.*;

public class ResidentBuilder implements HouseBuilder {
	public ResidentBuilder(){
		System.out.println("Resident builder is created");
	}
	public Door addDoor() {
		return new ResidentDoor();
	}	
	public Window addWindow() {
		return new ResidentWindow();
	}
	public Toilet addToilet() {
		return new ResidentToilet();
	}
	public Furniture addFurniture() {
		return new ResidentFurniture();
	}
}
