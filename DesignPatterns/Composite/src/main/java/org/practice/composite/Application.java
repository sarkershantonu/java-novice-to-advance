package org.practice.composite;

import org.practice.composite.components.Book;
import org.practice.composite.components.BookComponent;
import org.practice.composite.components.BookType;

public class Application {
	public static void main(String[] args) {
		BookComponent tinGoyendaSeries = new BookType("TinGoyenda", "Written by Rokib Hasan");
		BookComponent masudRana = new BookType("MasudRana", "Written by Kazi Anawar Hossain");
		BookComponent robindroNath = new BookType("RobindroNath", "Written by Robindro Nath Tagor");
		BookComponent allBooks = new BookType("Book List", "All available books");
		allBooks.add(robindroNath);
		robindroNath.add(new Book("Gitanjoli","Robindro Nath Tagor",1905));
		robindroNath.add(new Book("GolpoGuccho","Robindro Nath Tagor",1908));
		allBooks.add(masudRana);
		masudRana.add(new Book("Varot Nattoyom","Kazi Anawar Hossain", 1967));
		masudRana.add(new Book("Agni Purush","Kazi Anawar Hossain", 1969));
		allBooks.add(tinGoyendaSeries);
		tinGoyendaSeries.add(new Book("Jhamela","Rokib Hasan",1994));
		tinGoyendaSeries.add(new Book("TusarMeru","Rokib Hasan",1993));
		BookShelf myShelf = new BookShelf(allBooks);
		myShelf.getBookList();
	}
}
