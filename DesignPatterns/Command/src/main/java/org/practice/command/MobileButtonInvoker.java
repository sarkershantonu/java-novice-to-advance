package org.practice.command;


import org.practice.command.commands.Command;

public class MobileButtonInvoker {
	private Command aCommand;
	//private ArrayList<ICommand> commandQueue = new ArrayList<ICommand>();
	//If we want to apply stack based undo operation, we can keep an array list of ICommands and perform undo by invoker, but I apply that undo in ICommand.
	public MobileButtonInvoker(Command newConnand){
		aCommand=newConnand;
	}
	public void press() {
		aCommand.execute();
		//commandQueue.add(aCommand);
	}
	public void pressBack() {
		aCommand.undo();
	}
}
