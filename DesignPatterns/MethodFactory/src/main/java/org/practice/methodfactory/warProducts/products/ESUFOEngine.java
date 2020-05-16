package org.practice.methodfactory.warProducts.products;

import org.practice.methodfactory.warProducts.products.IEngine;

public class ESUFOEngine implements IEngine {
	public ESUFOEngine(){
		System.out.println("UFOEngine created");
	}
	public String toString(){
		return "1000 mph";
	}
}
