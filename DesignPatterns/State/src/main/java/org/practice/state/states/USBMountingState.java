package org.practice.state.states;

import org.practice.state.products.Mobile;

public class USBMountingState implements State {
	private Mobile myMobile;
	public USBMountingState(Mobile aMobile){
		myMobile = aMobile;
	}
	public void charge() {
		System.out.println("While USB Only mode, your device is by default charging");
		myMobile.setMobileState(myMobile.getCharging());
	}
	public void usbMount() {
		System.out.println("Deviec is in USB mode, access mobile storage from file explorer");
	}
	public void adbConnect() {
		System.out.println("While USB Only mode we can not access ADB , please select Android Debugging from Device settings");
		myMobile.setMobileState(myMobile.getAdb());
	}
}
