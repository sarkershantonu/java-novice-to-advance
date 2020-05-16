package org.practice.decorator.features;

import org.practice.decorator.products.Book;

//Offset Printing costs 200 taka extra
public class OffsetPrinting extends BookMaker {
	public OffsetPrinting(Book book) {
		super(book);
		System.out.println("Offset Printing");
	}
	public String getDescription() {
		return aBook.getDescription()+", offset printing";
	}
	public double getPrice() {
		return aBook.getPrice()+200.00;
	}
}
