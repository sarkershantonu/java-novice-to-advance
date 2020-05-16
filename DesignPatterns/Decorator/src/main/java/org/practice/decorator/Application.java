package org.practice.decorator;

import org.practice.decorator.features.FoilPaperCovering;
import org.practice.decorator.features.Leminate;
import org.practice.decorator.features.OffsetPrinting;
import org.practice.decorator.products.Book;
import org.practice.decorator.products.PlainBook;

public class Application {
	public static void main(String[] args) {
		Book rawBook = new OffsetPrinting(new FoilPaperCovering(new Leminate(new PlainBook())));
		System.out.println("Description "+ rawBook.getDescription());
		System.out.println("Total Price "+ rawBook.getPrice());
	}
}
