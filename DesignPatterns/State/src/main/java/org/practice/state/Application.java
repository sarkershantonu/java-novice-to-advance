package org.practice.state;

import org.practice.state.products.AndroidMobile;
import org.practice.state.products.Mobile;

public class Application {

	public static void main(String[] args) {
		Mobile samsungGalaxy = new AndroidMobile();//initial state will be charging
		samsungGalaxy.ChargeMobile();
		samsungGalaxy.AdbAccess();//mode will be change to ADB
		samsungGalaxy.AdbAccess();
		samsungGalaxy.USBConnect();//mode will change to USB
		samsungGalaxy.USBConnect();
	}
}
