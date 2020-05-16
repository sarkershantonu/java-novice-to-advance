package org.practice.mediator.products;

import org.practice.mediator.mediator.Mediator;

public class Administrators extends Employee{
	public Administrators(Mediator aMeadiator) {
		super(aMeadiator);
		System.out.println("Administrators have signed up for schooling \n");
	}
}
