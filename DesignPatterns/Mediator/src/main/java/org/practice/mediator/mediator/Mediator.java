package org.practice.mediator.mediator;

import org.practice.mediator.products.Employee;

public interface Mediator {
	public void giveKnowledge(String subject, int hour, int employeeCode);
	public void getKnowledge(String subject, int hour, int employeeCode);
	public void addEmployee(Employee employee);
}
