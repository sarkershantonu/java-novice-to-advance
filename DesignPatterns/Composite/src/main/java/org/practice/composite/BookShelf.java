package org.practice.composite;

import org.practice.composite.components.BookComponent;

public class BookShelf {
	BookComponent newBookList;
	public BookShelf(BookComponent bookType){
		newBookList = bookType;
	}
	public void getBookList() {
		newBookList.displayBookInfo();
	}
}
