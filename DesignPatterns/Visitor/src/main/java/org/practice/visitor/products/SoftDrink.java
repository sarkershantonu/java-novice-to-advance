package org.practice.visitor.products;

import org.practice.visitor.monitors.TaxMonitor;

public class SoftDrink implements Taxable {
	private double price;
	public SoftDrink(double aPRice){
		price=aPRice;
	}public double getPrice(){
		return price;
	}public double addTaxMonitor(TaxMonitor taxMonitor) {
		return taxMonitor.addTax(this);
	}
}
