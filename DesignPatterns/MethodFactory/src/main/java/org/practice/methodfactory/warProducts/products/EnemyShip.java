package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.products.IEngine;
import org.practice.methodfactory.warProducts.products.IWeapon;

public abstract class EnemyShip {
	private String name;
	public String getName(){return name;}
	public void setName(String newName){name=newName;}
	IEngine engine;
	IWeapon weapon;
	
	public abstract void makeShip();
	public void followShip() {
		System.out.println(getName()+" is following the hero at "+engine.toString());		
	}
	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");	
	}public void enemyShipShoots(){
		System.out.println(getName()+" is attacks and does "+weapon.toString());		
	}
	public String toString(){
		String info = "The "+name+" has a top spped of "+engine+" and an attack power of "+weapon;
		return info;
	}
}
