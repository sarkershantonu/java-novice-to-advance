package org.practice.builder.builders;

import org.practice.builder.products.MobileImpl;

public class MobileBuilderImpl implements MobileBuilder {
	private MobileImpl aMobileImpl =null;
	public MobileBuilderImpl() {
	aMobileImpl =new MobileImpl();
	}
	public void buildKeypad(){
		aMobileImpl.setKeypad("QWERTY-Pad");
	}
	public void buildSpeaker(){
		aMobileImpl.setSpeaker("Loude Speakers ");
	}	
	public void buildDisplayUnit(){
		aMobileImpl.setDisplayUnit("Touch Display");
	}
	public void buildMic(){
		aMobileImpl.setMic("High sensored mike");
	}
	public void buildNetwrkRadio(){
		aMobileImpl.setNetwrkRadio("3g Network");
	}
	public MobileImpl getMobile() {
		return aMobileImpl;
	}
}
