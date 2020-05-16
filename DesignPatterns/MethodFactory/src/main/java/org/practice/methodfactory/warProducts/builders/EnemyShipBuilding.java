package org.practice.methodfactory.warProducts.builders;

import org.practice.methodfactory.warProducts.products.EnemyShip;

public abstract class EnemyShipBuilding {
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	public EnemyShip orderAShip(String typeOfShip){
		EnemyShip myShip = makeEnemyShip(typeOfShip);
		myShip.makeShip();
		myShip.displayEnemyShip();
		myShip.enemyShipShoots();
		return myShip;
	}
}
