package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class PressHome implements Command {
	private Reciever myReceiver  = null;
	public PressHome(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.home();	
	}
	public void undo() {
		myReceiver.back();
	}
}
