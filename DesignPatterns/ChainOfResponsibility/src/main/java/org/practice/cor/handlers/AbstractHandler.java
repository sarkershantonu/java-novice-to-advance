package org.practice.cor.handlers;

import org.practice.cor.tasks.Task;

public abstract class AbstractHandler {

	protected AbstractHandler myNextHandler;
	/***
	 * to pass the request to successor, this will be used for making chain
	 * @param successor
	 */
	public void setMyNextHandler(AbstractHandler successor)
	{
		myNextHandler = successor;
	}
	/***
	 * This method actually responsible for doing task
	 * @param task
	 */
	public abstract void doThis(Task task);

}

	
	