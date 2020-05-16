package org.practice.methodfactory.warProducts.factories;

import org.practice.methodfactory.warProducts.products.ESUFOEngine;
import org.practice.methodfactory.warProducts.products.ESUFOGun;
import org.practice.methodfactory.warProducts.products.IEngine;
import org.practice.methodfactory.warProducts.products.IWeapon;

public class UFOEnemyShipFactory implements IEnemyShipFactory {
	public UFOEnemyShipFactory(){
		System.out.println("UFOEnemyShipFactory created");
	}
	public IEngine addESEngine(){
		return new ESUFOEngine();
	}
	public IWeapon addESGuns(){
		return new ESUFOGun();
	}
}
