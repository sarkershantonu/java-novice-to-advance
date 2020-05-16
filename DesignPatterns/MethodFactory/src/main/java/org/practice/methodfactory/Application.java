package org.practice.methodfactory;

import org.practice.methodfactory.factory.Factory;
import org.practice.methodfactory.factory.WritingProductFactory;
import org.practice.methodfactory.products.Product;
import org.practice.methodfactory.products.WritingProducts;

public class Application {
	public static void main(String[] args) {
		Factory creator = new WritingProductFactory(WritingProducts.pen);
		deliverProductToAShop(creator);
		creator = new WritingProductFactory(WritingProducts.pencil);
		deliverProductToAShop(creator);
	}	
	public static void deliverProductToAShop(Factory aFactory) {
		Product aProduct = aFactory.createProduct();
		aProduct.showMe();
	}
}
