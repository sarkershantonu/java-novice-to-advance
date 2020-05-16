package org.practice.methodfactory.writingProducts;

import org.practice.methodfactory.writingProducts.factory.Factory;
import org.practice.methodfactory.writingProducts.factory.WritingProductFactory;
import org.practice.methodfactory.writingProducts.products.Product;
import org.practice.methodfactory.writingProducts.products.WritingProducts;

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
