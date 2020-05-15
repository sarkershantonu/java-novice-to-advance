package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Toilet;

public class OfficeToilet  implements Toilet {
	public OfficeToilet(){
		System.out.println("office toilet is created"); 
	}
	public String toString(){
		return "only shawar no bathtub ";
	}

}
