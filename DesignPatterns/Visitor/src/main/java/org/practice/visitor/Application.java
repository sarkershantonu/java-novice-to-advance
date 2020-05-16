package org.practice.visitor;

import org.practice.visitor.monitors.SalesTaxMonitor;
import org.practice.visitor.products.Chocolate;
import org.practice.visitor.products.Fruit;
import org.practice.visitor.products.SoftDrink;

import java.text.DecimalFormat;

public class Application {
	public static DecimalFormat dt = new DecimalFormat("#.##");
	public static void main(String[] args) {
		SalesTaxMonitor vatMonitor = new SalesTaxMonitor();
		Chocolate chocolate = new Chocolate(20);// price 20
		SoftDrink drinks = new SoftDrink(40);// price 40
		Fruit apple = new Fruit(15);// price 15
		System.out.println("The VAT summary");
		System.out.println(dt.format(chocolate.addTaxMonitor(vatMonitor)));
		System.out.println(dt.format(drinks.addTaxMonitor(vatMonitor)));
		System.out.println(dt.format(apple.addTaxMonitor(vatMonitor)));
	}
}
