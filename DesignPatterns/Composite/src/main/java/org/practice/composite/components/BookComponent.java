package org.practice.composite.components;

public abstract class BookComponent implements DisplayComponent {
	//Book type related task , so exception for book as leaf 
	public void add(BookComponent aComponent){
		throw new UnsupportedOperationException();
	}
	public void delete(BookComponent aComponent){
		throw new UnsupportedOperationException();
	}
	public BookComponent getComponent(int index){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public String getAutherName(){
		throw new UnsupportedOperationException();
	}
	public int getPublishedYear(){
		throw new UnsupportedOperationException();
	}
	//This is common function, if we implement only interface we can put it in interface
	public void displayBookInfo(){
		throw new UnsupportedOperationException();
	}
}
