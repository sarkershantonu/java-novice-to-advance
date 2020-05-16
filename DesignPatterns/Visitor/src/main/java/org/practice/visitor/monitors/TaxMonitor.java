package org.practice.visitor.monitors;

import org.practice.visitor.products.Chocolate;
import org.practice.visitor.products.Fruit;
import org.practice.visitor.products.SoftDrink;

//The visitor interface
public interface TaxMonitor {
	double addTax(Chocolate aChocolate);
	double addTax(SoftDrink aDrink);
	double addTax(Fruit aFruit);
}
