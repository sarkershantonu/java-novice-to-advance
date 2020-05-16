package org.practice.state.products;

import org.practice.state.states.AdbState;
import org.practice.state.states.ChargingState;
import org.practice.state.states.State;
import org.practice.state.states.USBMountingState;

//Context Class
public class AndroidMobile implements Mobile {
	private State charging;
	private State usb;
	private State adb;
	
	private State mobileState;
	public void setMobileState(State aState) {
		mobileState= aState;
	}
	public AndroidMobile(){
		charging = new ChargingState(this);
		usb = new USBMountingState(this);
		adb = new AdbState(this);
		mobileState = charging;
	}
	//next three are for accessing functions in one state
	public void ChargeMobile(){
		mobileState.charge();
	}
	public void USBConnect(){
		mobileState.usbMount();
	}
	public void  AdbAccess() {
		mobileState.adbConnect();
	}
	// next three are getting states
	public State getCharging() {
		return charging;
	}	
	public State getUsb() {
		return usb;
	}	
	public State getAdb() {
		return adb;
	}
}
