package org.practice.decorator.features;

import org.practice.decorator.products.Book;

//Lemination costs 20 taka extra
public class Leminate extends BookMaker {
	public Leminate(Book book) {
		super(book);
		System.out.println("Leminated");
	}
	public String getDescription() {
		return aBook.getDescription()+", Leminated";
	}
	public double getPrice() {
		return aBook.getPrice()+20.00;
	}
}
