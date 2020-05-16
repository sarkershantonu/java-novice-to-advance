package org.practice.methodfactory.warProducts;

import org.practice.methodfactory.warProducts.builders.EnemyShipBuilding;
import org.practice.methodfactory.warProducts.builders.UFOEnemyShipBuilding;
import org.practice.methodfactory.warProducts.products.EnemyShip;

public class Application {

	public static void main(String[] args) {
		EnemyShipBuilding myShipOrder = new UFOEnemyShipBuilding();
		EnemyShip myShip = myShipOrder.orderAShip("UFO");
		System.out.println(myShip+"\n");
		EnemyShip myBoss=myShipOrder.orderAShip("UFO BOSS");
		System.out.println(myBoss+"\n");
	}
}
