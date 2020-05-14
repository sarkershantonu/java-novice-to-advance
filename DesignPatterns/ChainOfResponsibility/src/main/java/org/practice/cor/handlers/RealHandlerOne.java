package org.practice.cor.handlers;

import org.practice.cor.tasks.Task;

public class RealHandlerOne extends MyHandler {

	public void doThis(Task task){
		if(task.getValue()<0)
		{
			System.out.println("This is Handler One and value = "+ task.getValue());
			
		}else{
			myNextHandler.doThis(task);	
		}		
	}
	public RealHandlerOne() {
		// TODO Auto-generated constructor stub
	}

}
