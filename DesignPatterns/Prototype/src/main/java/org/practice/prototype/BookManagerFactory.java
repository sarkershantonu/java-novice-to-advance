package org.practice.prototype;

import org.practice.prototype.products.BookPrototype;

public class BookManagerFactory {
public BookPrototype getClone(BookPrototype abook) {
	return abook.makeAClone();
}
}
