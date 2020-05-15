package org.practice.abstractfactory.products;

import org.practice.abstractfactory.builders.HouseBuilder;

public class Resident extends House{
	private HouseBuilder myBuilder;
	public Resident(HouseBuilder aBuilder) {
		myBuilder=aBuilder;
		System.out.println("Resident house Created");
	}
	public void makehouse() {
		System.out.println("Making  "+getName());
		aDoor = myBuilder.addDoor();
		furniture = myBuilder.addFurniture();
		aToilet=myBuilder.addToilet();
		aWindow=myBuilder.addWindow();
	}
}
