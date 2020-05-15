package org.practice.abstractfactory.products;

import org.practice.abstractfactory.builders.HouseBuilder;

public class Office extends House{
	private HouseBuilder myBuilder;
	public Office(HouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Office Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
