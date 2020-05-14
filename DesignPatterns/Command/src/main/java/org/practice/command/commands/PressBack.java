package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class PressBack implements Command {
	private Reciever myReceiver  = null;
	public PressBack(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.back();
	}
	public void undo()// Usually back is the undo it self.
	{
		myReceiver.back();
	}
}
