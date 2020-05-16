package org.practice.mediator.products;

import org.practice.mediator.mediator.Mediator;

public class Developer extends Employee{
	public Developer(Mediator aMeadiator) {
		super(aMeadiator);
		System.out.println("Developers have signed up for schooling \n");
	}
}
