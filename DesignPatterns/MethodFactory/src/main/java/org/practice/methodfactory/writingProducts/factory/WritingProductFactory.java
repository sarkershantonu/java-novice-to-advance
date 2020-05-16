package org.practice.methodfactory.writingProducts.factory;

import org.practice.methodfactory.products.*;
import org.practice.methodfactory.writingProducts.products.*;

public class WritingProductFactory implements Factory {
	WritingProducts productName;
	public Product createProduct()
	{	
		switch(productName)
		{
			case pen : 
			return new Pen();
			case pencil :
			return new Pencil();
			case eager :
				return new Eager();
		}
		return null;
	}
	public WritingProductFactory(WritingProducts product) {
		this.productName = product;
	}
}