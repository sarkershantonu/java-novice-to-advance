package org.practice.abstractfactory.builders;

import org.practice.abstractfactory.components.Door;
import org.practice.abstractfactory.components.Furniture;
import org.practice.abstractfactory.components.Toilet;
import org.practice.abstractfactory.components.Window;

//this is factory class
public interface HouseBuilder {
	public Door addDoor();
	public Window addWindow();
	public Toilet addToilet();
	public Furniture addFurniture();
}
