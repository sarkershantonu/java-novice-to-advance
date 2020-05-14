package org.practice.cor;

import org.practice.cor.handlers.*;
import org.practice.cor.tasks.Task;

public class Application {

	public static void main(String[] args) {		
		AbstractHandler handler1 = new RealHandlerOne();
		AbstractHandler handler2 = new RealHandlerTwo();
		AbstractHandler handler3 = new RealHandlerThree();
		AbstractHandler handler4 = new RealHandlerFour();
		
		//Making chain of commands
		handler1.setMyNextHandler(handler2);
		handler2.setMyNextHandler(handler3);
		handler3.setMyNextHandler(handler4);
		handler4.setMyNextHandler(handler1);
		
		Task t1 = new Task(-100,"Negative value");
		Task t2 = new Task(0,"ZERO");
		Task t3 = new Task(1,"ONE");
		Task t4 = new Task(2,"TWO");
		Task t5 = new Task(3,"THREE");
		Task t6 = new Task(4,"FOUR");
		
		//Calling the request, user need to call only handler 1. 
		handler1.doThis(t1);
		handler1.doThis(t2);
		handler1.doThis(t3);
		handler1.doThis(t4);
		handler1.doThis(t5);
		handler1.doThis(t6);
		
	}

}
