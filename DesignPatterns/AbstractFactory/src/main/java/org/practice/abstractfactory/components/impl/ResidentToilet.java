package org.practice.abstractfactory.components.impl;

import org.practice.abstractfactory.components.Toilet;

public class ResidentToilet implements Toilet {
	public ResidentToilet(){
		System.out.println("Residen toilet is created"); 
	}
	public String toString(){
		return "bathtub and shawar ";
	}
}
