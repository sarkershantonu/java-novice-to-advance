package org.practice.visitor.monitors;

import org.practice.visitor.products.Chocolate;
import org.practice.visitor.products.Fruit;
import org.practice.visitor.products.SoftDrink;

public class SurceTaxMonitor implements TaxMonitor {
	public double addTax(Chocolate aChocolate) {
		System.out.println("No source Tax for Chocolate");
		return aChocolate.getPrice();
	}
	public double addTax(SoftDrink aDrink) {
		System.out.println("Source Tax Added with a Drink");
		return aDrink.getPrice()*1.01;
	}
	public double addTax(Fruit aFruit) {
		System.out.println("No source Tax for fruits");
		return aFruit.getPrice();
	}
}
