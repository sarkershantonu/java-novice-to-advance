package org.practice.visitor.monitors;

import org.practice.visitor.products.Chocolate;
import org.practice.visitor.products.Fruit;
import org.practice.visitor.products.SoftDrink;

public class SalesTaxMonitor implements TaxMonitor {
	public double addTax(Chocolate aChocolate) {
		System.out.println("Sales Tax Added with a Chocolate");
		return aChocolate.getPrice()*1.015;
	}
	public double addTax(SoftDrink aDrink) {
		System.out.println("Sales Tax Added with a Drink");
		return aDrink.getPrice()*1.015;
	}
	public double addTax(Fruit aFruit) {
		System.out.println("Sales Tax Added with a Fruit");
		return aFruit.getPrice()*1.015;
	}
}
