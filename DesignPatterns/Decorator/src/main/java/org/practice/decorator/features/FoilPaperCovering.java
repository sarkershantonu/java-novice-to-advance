package org.practice.decorator.features;

import org.practice.decorator.products.Book;

//Foli paper covering costing 10.50 taka extra
public class FoilPaperCovering extends BookMaker {
	public FoilPaperCovering(Book book) {
		super(book);
		System.out.println("Coverd with foil paper");
	}
	public String getDescription() {
		return aBook.getDescription()+", foil paper covering";
	}
	public double getPrice() {
		return aBook.getPrice()+10.50;
	}
}
