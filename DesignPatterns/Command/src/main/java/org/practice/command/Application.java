package org.practice.command;

import org.practice.command.commands.*;

public class Application {
	public static void main(String[] args) {
		MobileReceiver aMobile= Mobile.getAReciever();
		Command command = new TurnMobileOn(aMobile);
		MobileButtonInvoker invoker = new MobileButtonInvoker(command);
		invoker.press();
		command = new PressHome(aMobile);
		invoker = new MobileButtonInvoker(command);
		invoker.press();
		command = new PressBack(aMobile);
		invoker = new MobileButtonInvoker(command);
		invoker.press();
		command = new VolumeUp(aMobile);
		invoker = new MobileButtonInvoker(command);
		invoker.press();
		invoker.press();
		invoker.pressBack();
		command = new VolumeDown(aMobile);
		invoker = new MobileButtonInvoker(command);
		invoker.press();
		command = new TurnMobileOff(aMobile);
		invoker = new MobileButtonInvoker(command);
		invoker.press();
		invoker.pressBack();		
	}
}
