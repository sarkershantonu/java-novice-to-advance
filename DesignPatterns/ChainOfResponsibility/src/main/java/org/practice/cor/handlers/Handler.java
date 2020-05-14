package org.practice.cor.handlers;

import org.practice.cor.tasks.Task;

/***
 * We can use this interface also
 * @author shantonu
 *
 */
public interface Handler {
	void setMyNextHandler(AbstractHandler successor);
	void doThis(Task task);
}
