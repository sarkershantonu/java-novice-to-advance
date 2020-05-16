package org.practice.iterator.collections;

import org.practice.iterator.BookIterator;
import org.practice.iterator.products.Book;

import java.util.Arrays;
import java.util.Iterator;

public class ScienceBook implements BookIterator {
	Book[] myScienceBook ;
	int index = 0;
	public ScienceBook(){
		myScienceBook = new Book[2];
		addBook(new Book("Encyclopodia"));
		addBook(new Book("SpaceShips"));
	}
	public void addBook(Book aBook) {
		myScienceBook[index] = aBook;
		index++;
	}
	public Iterator createIterator() {		
		return Arrays.asList(myScienceBook).iterator();//adding iterator in array as list
	}
}
