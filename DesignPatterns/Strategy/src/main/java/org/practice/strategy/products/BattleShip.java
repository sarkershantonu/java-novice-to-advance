package org.practice.strategy.products;

import org.practice.strategy.strategies.HeavyArtillery;

public class BattleShip extends Ship{
	public BattleShip(String aName) {
		super(aName);
		System.out.println("A Battle ship is created");
		work=new HeavyArtillery();
	}
}
