package org.practice.bridge.devices;

public class SerialDevice extends Device{
	public SerialDevice(){
		type="Serial";
		deviceConnectionStatus=true;
	}
	public boolean validateDevice() {
		System.out.println("System is validating Serial device");
		return true;
	}
}
