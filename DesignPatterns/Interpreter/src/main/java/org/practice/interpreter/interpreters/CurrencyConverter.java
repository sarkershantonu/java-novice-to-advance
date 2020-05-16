package org.practice.interpreter.interpreters;

import org.practice.interpreter.context.CurrencyContext;

public abstract class CurrencyConverter {
	public abstract double usd(int input);
	public abstract double gbp(int input);
	public abstract double bdt(int input);
	public abstract double myr(int input);
	public void interpret(CurrencyContext acontext, String type){
		if(type=="usd"){
			acontext.setOutput(usd(acontext.getInput()));
		}else if(type=="bdt"){
			acontext.setOutput(bdt(acontext.getInput()));
		}else if(type=="gbp"){
			acontext.setOutput(gbp(acontext.getInput()));
		}else if(type=="myr"){
			acontext.setOutput(myr(acontext.getInput()));
		}
	}
}
