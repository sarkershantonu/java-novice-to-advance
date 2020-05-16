package org.practice.interpreter.context;

public class CurrencyContext {
	private int input;
	private double output;
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public double getOutput() {
		return output;
	}
	public void setOutput(double output) {
		this.output = output;
	}
	public CurrencyContext(int in){
		this.input=in;
	}
}
