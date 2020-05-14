package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class VolumeUp implements Command {
	private Reciever myReceiver  = null;
	public VolumeUp(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.volumeUp();;	
	}
	public void undo() {
		myReceiver.volumeDowne();;
	}
}
