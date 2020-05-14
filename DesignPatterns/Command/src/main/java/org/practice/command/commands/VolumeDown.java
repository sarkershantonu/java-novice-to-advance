package org.practice.command.commands;

import org.practice.command.Reciever;
import org.practice.command.commands.Command;

public class VolumeDown  implements Command {
	private Reciever myReceiver  = null;
	public VolumeDown(Reciever aReceiver ){
		myReceiver= aReceiver ;		
	}
	public void execute() {
		myReceiver.volumeDowne();	
	}
	public void undo() {
		myReceiver.volumeUp();
	}
}
