package org.practice.facade.facades;

import org.practice.facade.Student;
import org.practice.facade.features.Attendance;
import org.practice.facade.features.Behavior;
import org.practice.facade.features.Results;

public class ReportCardFacade {
	private Student student;
	private Results studentResult;
	private Behavior studentBehavior;
	private Attendance studentAttendance;
	public ReportCardFacade(Student aStudent){
		student=aStudent;
		studentResult = new Results(aStudent);
		studentBehavior=new Behavior(aStudent);
		studentAttendance=new Attendance(aStudent);		
	}
	public void getResultCard() {
		System.out.println("This is result of "+student.getName()+" Who's date of birth is "+student.getDateOfBirth());
		studentResult.getStudentResult();
		studentAttendance.getStudentAttendance();
		studentBehavior.getStudentBehavior();
	}
}
