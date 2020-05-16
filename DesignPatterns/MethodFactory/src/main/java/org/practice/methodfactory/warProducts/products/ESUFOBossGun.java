package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.products.IWeapon;

public class ESUFOBossGun implements IWeapon {
	public ESUFOBossGun(){
		System.out.println("UFOBoss Gun created");
	}
	public String toString(){
		return "40 damage";
	}
}
