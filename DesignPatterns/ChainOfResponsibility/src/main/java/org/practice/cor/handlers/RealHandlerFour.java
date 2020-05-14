package org.practice.cor.handlers;

import org.practice.cor.tasks.Task;

public class RealHandlerFour extends MyHandler {

	public void doThis(Task task){
		if(task.getValue()==4)
		{
			System.out.println("This is Handler Four and value = "+ task.getValue());			
		}
		else{
			myNextHandler.doThis(task);
					
		}		
	}
	public RealHandlerFour() {
		
	}

}
