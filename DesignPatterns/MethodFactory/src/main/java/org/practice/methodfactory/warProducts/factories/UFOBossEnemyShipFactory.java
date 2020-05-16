package org.practice.methodfactory.warProducts.factories;

import org.practice.methodfactory.warProducts.products.ESUFOBossEngine;
import org.practice.methodfactory.warProducts.products.ESUFOBossGun;
import org.practice.methodfactory.warProducts.products.IEngine;
import org.practice.methodfactory.warProducts.products.IWeapon;

public class UFOBossEnemyShipFactory implements IEnemyShipFactory {
	public UFOBossEnemyShipFactory() {System.out.println("UFOBossEnemyShipFactory created");}
	public IEngine addESEngine(){
		return new ESUFOBossEngine();
	}
	public IWeapon addESGuns(){
		return new ESUFOBossGun();
	}
}
