package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.products.IWeapon;

public class ESUFOGun implements IWeapon {
	public ESUFOGun(){
		System.out.println("UFOGun created");
	}
	public String toString(){
		return "20 damage";
	}
}
