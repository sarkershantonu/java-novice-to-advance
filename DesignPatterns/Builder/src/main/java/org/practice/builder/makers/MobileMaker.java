package org.practice.builder.makers;

import org.practice.builder.builders.MobileBuilder;
import org.practice.builder.products.Mobile;
import org.practice.builder.products.MobileImpl;

public class MobileMaker {
	private MobileBuilder myBuilder;
	public MobileMaker(MobileBuilder aBuilder){
		myBuilder=aBuilder;
	}
	public MobileImpl getMobile(){
		return myBuilder.getMobile();
	}
	public void buildMobile(){
		myBuilder.buildDisplayUnit();
		myBuilder.buildKeypad();
		myBuilder.buildMic();
		myBuilder.buildNetwrkRadio();
		myBuilder.buildSpeaker();
	}
}
