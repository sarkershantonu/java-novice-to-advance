package org.practice.facade.features;

import org.practice.facade.Student;

public class Results {
	private Student student;
	private double totalMarks = 1000.00;
	public Results(Student aStudent){
		student=aStudent;
	}
	public void getStudentResult(){
		System.out.println(student.getName()+"'s Result = "+totalMarks+" Marks");
	}
}
