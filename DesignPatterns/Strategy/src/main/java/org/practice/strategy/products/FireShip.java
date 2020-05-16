package org.practice.strategy.products;

import org.practice.strategy.strategies.HeavyArtillery;

public class FireShip extends Ship{
	public FireShip(String aName) {
		super(aName);
		System.out.println("A fire ship is created");
		work=new HeavyArtillery();
	}
}
