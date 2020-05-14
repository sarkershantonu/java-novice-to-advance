package org.practice.bridge.devices;

public abstract class Device {
	protected String type="Generic Device";
	protected boolean deviceConnectionStatus=false;
	public String getType() {
		return type;
	}
	public void connectDevice(){
		System.out.println("A device is connected"); 
		deviceConnectionStatus=true;
	}
	public abstract boolean validateDevice();
	public void ejectDevice(){
		System.out.println("Ejecting.....");
		deviceConnectionStatus=false;
	}	
}
