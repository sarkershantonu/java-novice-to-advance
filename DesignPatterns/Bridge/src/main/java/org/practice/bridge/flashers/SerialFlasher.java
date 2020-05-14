package org.practice.bridge.flashers;

import org.practice.bridge.devices.SerialDevice;

public class SerialFlasher extends Flasher{

	public SerialFlasher(SerialDevice aDevice) //we can keep that abstract(that means public SerialFlasher(Device aDevice)) but, i felt is logical to use specific flasher for specific device.
	{
		super(aDevice);
	}
	public void communicateViaProtocall() {
		System.out.println("Sysem is communicating with USB devices for flashing");
	}
	public void flashDevice() {
		System.out.println("USB Flasher is flashing "+myDevice.getType()+" Device");
	}
}
