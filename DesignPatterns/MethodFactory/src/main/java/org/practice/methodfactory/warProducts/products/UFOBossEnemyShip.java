package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.factories.IEnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip{
	IEnemyShipFactory myShipFactory;

	public UFOBossEnemyShip(IEnemyShipFactory shipFactory){
		myShipFactory = shipFactory;
		System.out.println("UFO Boss Created");
	}
	public void makeShip() {
		System.out.println("Making enemy boss ship "+getName());
		weapon = myShipFactory.addESGuns();
		engine = myShipFactory.addESEngine();
	}

}
