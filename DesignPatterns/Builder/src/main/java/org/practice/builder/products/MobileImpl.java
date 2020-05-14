package org.practice.builder.products;

public class MobileImpl implements Mobile {
	private String displayUnit;
	private String keypad;
	private String speaker;
	private String mic;
	private String netwrkRadio;
	public String getDisplayUnit() {
		return displayUnit;	
		}			
	public String getKeypad() {
		return keypad;
	}
	public String getNetwrkRadio() {
		return netwrkRadio;
	}
	public String getSpeaker() {
		return speaker;
	}	
	public String getMic() {
		return mic;
	}
	public void setKeypad(String keypad) {
		this.keypad = keypad;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}	
	public void setDisplayUnit(String displayUnit) {
		this.displayUnit = displayUnit;
	}
	public void setMic(String mic) {
		this.mic = mic;
	}
	public void setNetwrkRadio(String netwrkRadio) {
		this.netwrkRadio = netwrkRadio;
	}
}
