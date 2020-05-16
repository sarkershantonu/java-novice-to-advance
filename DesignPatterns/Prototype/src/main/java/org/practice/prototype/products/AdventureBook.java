package org.practice.prototype.products;

public class AdventureBook implements BookPrototype{
	public AdventureBook(){
		System.out.println("An adventure book is bought");
	}
	public BookPrototype makeAClone() {
		AdventureBook aBook=null;
		try {
			aBook = (AdventureBook)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("An adventure book is cloned");
		return aBook;
	}
}
