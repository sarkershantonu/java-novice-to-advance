package org.practice.bridge.flashers;

import org.practice.bridge.devices.USBDevice;

public class USBFlasher extends Flasher{

	public USBFlasher(USBDevice aDevice) //we can keep that abstract(that means public USBFlasher(Device aDevice)) but, i felt is logical to use specific flasher for specific device.
	{
		super(aDevice);
	}
	public void communicateViaProtocall() {
		System.out.println("Sysem is communicating with serial port for flashing");
	}
	public void flashDevice() {
		System.out.println("Serial Flasher is flashing "+myDevice.getType()+" Device");
	}
}
