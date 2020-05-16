package org.practice.visitor.monitors;

import org.practice.visitor.products.Chocolate;
import org.practice.visitor.products.Fruit;
import org.practice.visitor.products.SoftDrink;

public class StateTaxMonitor implements TaxMonitor {
	public double addTax(Chocolate aChocolate) {
		System.out.println("State Tax Added with a Chocolate");
		return aChocolate.getPrice()*1.005;
	}
	public double addTax(SoftDrink aDrink) {
		System.out.println("State Tax Added with a Drink");
		return aDrink.getPrice()*1.005;
	}
	public double addTax(Fruit aFruit) {
		System.out.println("No State Tax fora Fruit");
		return aFruit.getPrice();
	}
}
