package org.practice.builder.builders;

import org.practice.builder.products.MobileImpl;

public interface MobileBuilder {
	 void buildKeypad();
	 void buildSpeaker();
	 void buildDisplayUnit() ;
	 void buildMic();
	 void buildNetwrkRadio();
	 MobileImpl getMobile();
}
