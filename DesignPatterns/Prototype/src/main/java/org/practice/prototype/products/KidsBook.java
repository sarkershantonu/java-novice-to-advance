package org.practice.prototype.products;

public class KidsBook implements BookPrototype{
	public KidsBook(){
		System.out.println("A Kids book is bought");
	}
	public BookPrototype makeAClone() {
		KidsBook aBook=null;
		try {
			aBook = (KidsBook)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("A Kids book is cloned");
		return aBook;
	}
}

