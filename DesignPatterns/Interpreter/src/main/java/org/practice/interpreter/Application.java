package org.practice.interpreter;

import org.practice.interpreter.context.CurrencyContext;
import org.practice.interpreter.interpreters.BDTConverter;
import org.practice.interpreter.interpreters.CurrencyConverter;

public class Application {
	public static void main(String[] args) {
		System.out.println("We will convert BDT 1000 to other languages");
		CurrencyContext bdtCurrency = new CurrencyContext(1000);
		CurrencyConverter bdConvert = new BDTConverter();
		bdConvert.interpret(bdtCurrency, "usd"); 
		System.out.println("After conversion "+bdtCurrency.getOutput());
	}
}
