package org.practice.facade;

import org.practice.facade.facades.ReportCardFacade;

public class Application {
	public static void main(String[] args) {
		Student aSudent = new Student();
		ReportCardFacade studentReport = new ReportCardFacade(aSudent);
		studentReport.getResultCard();		
	}
}
