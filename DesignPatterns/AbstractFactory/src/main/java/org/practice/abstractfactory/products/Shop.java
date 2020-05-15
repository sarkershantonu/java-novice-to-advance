package org.practice.abstractfactory.products;

import org.practice.abstractfactory.builders.HouseBuilder;

public class Shop extends House{
	private HouseBuilder myBuilder;
	public Shop(HouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Shop Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
