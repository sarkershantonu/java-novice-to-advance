package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class TurnMobileOff implements Command {
	private Reciever myReceiver  = null;
	public TurnMobileOff(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.off();	
	}
	public void undo() {
		myReceiver.on();
	}
}
