package org.practice.builder;

import org.practice.builder.builders.MobileBuilder;
import org.practice.builder.builders.MobileBuilderImpl;
import org.practice.builder.makers.MobileMaker;
import org.practice.builder.products.Mobile;
import org.practice.builder.products.MobileImpl;

public class Application {
	public static void main(String[] args) {
		MobileBuilder aBuilder = new MobileBuilderImpl();
		MobileMaker aMaker = new MobileMaker(aBuilder);
		aMaker.buildMobile();
		MobileImpl aMobileImpl = aMaker.getMobile();
		System.out.println("A Mobile is ordered to build");
		System.out.println("The Mobile Keypad = "+ aMobileImpl.getKeypad());
		System.out.println("The Mobile Display = "+ aMobileImpl.getDisplayUnit());
		System.out.println("The Mobile Netwrk = "+ aMobileImpl.getNetwrkRadio());
		System.out.println("The Mobile Speaker = "+ aMobileImpl.getSpeaker());
		System.out.println("The Mobile Mic = "+ aMobileImpl.getMic());
	}
}
