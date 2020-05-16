package org.practice.interpreter.interpreters;

public class MYRConverter extends CurrencyConverter {
	public double usd(int input) {
		return input*0.3028;
	}
	public double gbp(int input) {
		return input*0.1813;
	}
	public double bdt(int input) {
		return input*23.4720;
	}
	public double myr(int input) {
		return input;
	}
}
