package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.products.IEngine;

public class ESUFOBossEngine implements IEngine {
	public ESUFOBossEngine(){
		System.out.println("UFOBoss Engine created");
	}
	public String toString(){
		return "2000 mph";
	}
}
