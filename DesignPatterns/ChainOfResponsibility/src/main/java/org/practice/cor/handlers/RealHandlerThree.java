package org.practice.cor.handlers;

import org.practice.cor.tasks.Task;

public class RealHandlerThree extends MyHandler{

	public void doThis(Task task){
		if(task.getValue()>0)
		{
			System.out.println("This is Handler Three and value = "+ task.getValue());
			
		}else{
			myNextHandler.doThis(task);	
		}		
	}
	public RealHandlerThree() {		
	}

}
