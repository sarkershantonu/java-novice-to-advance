package org.practice.interpreter.interpreters;

public class GBPConverter extends CurrencyConverter {
	public double usd(int input) {
		return input*1.6703;
	}
	public double gbp(int input) {
		return input;
	}
	public double bdt(int input) {
		return input*129.4726;
	}
	public double myr(int input) {
		return input*5.5160;
	}
}
