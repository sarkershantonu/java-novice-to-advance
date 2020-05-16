package org.practice.mediator.products;

import org.practice.mediator.mediator.Mediator;

public class Testers extends Employee {
	public Testers(Mediator aMeadiator) {
		super(aMeadiator);
		System.out.println("Testers have signed up for schooling \n");
	}
}
