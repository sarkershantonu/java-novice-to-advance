package org.practice.abstractfactory.builders.impl;

import org.practice.abstractfactory.builders.HouseBuilder;
import org.practice.abstractfactory.components.impl.OfficeDoor;
import org.practice.abstractfactory.components.impl.OfficeFurniture;
import org.practice.abstractfactory.components.impl.OfficeToilet;
import org.practice.abstractfactory.components.impl.OfficeWindow;
import org.practice.abstractfactory.components.*;

public class OfficeBuilder implements HouseBuilder {
	public OfficeBuilder(){
		System.out.println("Shop builder is created");
	}
	public Door addDoor() {
		return new OfficeDoor();
	}	
	public Window addWindow() {
		return new OfficeWindow();
	}
	public Toilet addToilet() {
		return new OfficeToilet();
	}
	public Furniture addFurniture() {
		return new OfficeFurniture();
	}
}
