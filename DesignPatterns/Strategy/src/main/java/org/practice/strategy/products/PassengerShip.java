package org.practice.strategy.products;

import org.practice.strategy.strategies.People;

public class PassengerShip extends Ship {
	public PassengerShip(String aName) {
		super(aName);
		System.out.println("A passenger ship is created");
		work=new People();
	}
}
