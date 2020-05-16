package org.practice.methodfactory.warProducts.builders;

import org.practice.methodfactory.warProducts.factories.IEnemyShipFactory;
import org.practice.methodfactory.warProducts.factories.UFOBossEnemyShipFactory;
import org.practice.methodfactory.warProducts.factories.UFOEnemyShipFactory;
import org.practice.methodfactory.warProducts.products.EnemyShip;
import org.practice.methodfactory.warProducts.products.UFOBossEnemyShip;
import org.practice.methodfactory.warProducts.products.UFOEnemyShip;

//this class does the creation, orders different factory, seems like the trading person.
public class UFOEnemyShipBuilding extends EnemyShipBuilding{

	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip myShip = null;
		IEnemyShipFactory shipFactory = null;
		if(typeOfShip.equals("UFO"))
		{
			shipFactory = new UFOEnemyShipFactory();
			myShip = new UFOEnemyShip(shipFactory);
			myShip.setName("UFO Ship");
		}
		else if(typeOfShip.equals("UFO BOSS"))
		{
			shipFactory = new UFOBossEnemyShipFactory();
			myShip=new UFOBossEnemyShip(shipFactory);
			myShip.setName("UFO Boss Ship");
		}
		return myShip;
	}

}
