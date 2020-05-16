package org.practice.visitor.products;

import org.practice.visitor.monitors.TaxMonitor;

public class Fruit implements Taxable {
	private double price;
	public Fruit(double aPRice){
		price=aPRice;
	}public double getPrice(){
		return price;
	}
	public double addTaxMonitor(TaxMonitor taxMonitor) {
		return taxMonitor.addTax(this);
	}
}
