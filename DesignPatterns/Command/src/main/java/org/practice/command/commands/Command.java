package org.practice.command.commands;

public interface Command {
	public void execute();
	public void undo();//in android mobile, back button refers to undo if any command do not have inverse function(like volume has + & - or power button has On & off
}
