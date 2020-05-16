package org.practice.prototype;

import org.practice.prototype.products.AdventureBook;
import org.practice.prototype.products.BookPrototype;
import org.practice.prototype.products.KidsBook;

public class Application {
	public static void main(String[] args) {
		BookManagerFactory bookCloner = new BookManagerFactory();
		BookPrototype aCloneBook = null;
		BookPrototype aBook = new AdventureBook();
		aCloneBook=(AdventureBook)bookCloner.getClone(aBook);
		System.out.println("The hash code for original Adventure book = "+System.identityHashCode(aBook));
		System.out.println("The hash code for cloned Adventure book = "+System.identityHashCode(aCloneBook));
		aBook = new KidsBook();
		aCloneBook=(KidsBook)bookCloner.getClone(aBook);
		System.out.println("The hash code for original kid book = "+System.identityHashCode(aBook));
		System.out.println("The hash code for cloned kid book = "+System.identityHashCode(aCloneBook));
	}
}
