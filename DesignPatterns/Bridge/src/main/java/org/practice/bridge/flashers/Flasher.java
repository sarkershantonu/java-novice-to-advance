package org.practice.bridge.flashers;

import org.practice.bridge.devices.Device;

public abstract class Flasher {
	protected Device myDevice = null;
	public boolean flashStatus=false;
	public Flasher(Device aDevice){
		myDevice=aDevice;
	}
	public void connectDevice(){
		myDevice.connectDevice();
	}
	public void validateDevice(){
		if(myDevice.validateDevice()){
			System.out.println(myDevice.getType()+" device is a valid in the system");
			flashStatus=true;
		}else{
			System.out.println(myDevice.getType()+" device is a not valid in the system");
		}
	}
	public void initFlashing(){
		System.out.println("A "+myDevice.getType() +" is initilizing from flashing");
	}
	public abstract void communicateViaProtocall();
	public abstract void flashDevice();
	public void eject(){
		myDevice.ejectDevice();
	}
}
