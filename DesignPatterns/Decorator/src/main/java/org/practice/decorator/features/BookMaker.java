package org.practice.decorator.features;

import org.practice.decorator.products.Book;

//This is decorator abstract which composite all decorators together
public abstract class BookMaker implements Book {
	protected Book aBook;
	public BookMaker(Book book) {
		aBook = book;
	}	
	public String getDescription() {
		return aBook.getDescription();
	}	
	public double getPrice() {
		return aBook.getPrice();
	}
}
