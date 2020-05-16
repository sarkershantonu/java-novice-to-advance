package org.practice.iterator.collections;

import org.practice.iterator.BookIterator;
import org.practice.iterator.products.Book;

import java.util.ArrayList;
import java.util.Iterator;

public class Detectivebooks implements BookIterator {
	ArrayList<Book> myDetectivebooks ;
	public Detectivebooks(){
		myDetectivebooks = new ArrayList<Book>();
		addBook(new Book("Varoth Nattyom-Rana"));
		addBook(new Book("Jhamela-TinGoyenda"));
		addBook(new Book("PanchPandob"));
	}
	public void addBook(Book aBook) {
		myDetectivebooks.add(aBook);		
	}
	public Iterator createIterator() {		
		return myDetectivebooks.iterator();
	}
}
