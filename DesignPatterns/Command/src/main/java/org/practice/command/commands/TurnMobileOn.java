package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class TurnMobileOn implements Command {
	private Reciever myReceiver  = null;
	public TurnMobileOn(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.on();	
	}
	public void undo() {
		myReceiver.off();
	}
}