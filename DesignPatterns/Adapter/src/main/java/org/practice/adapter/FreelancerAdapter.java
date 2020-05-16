package org.practice.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreelancerAdapter implements Employee {
	private Freelancer freelancer = null;
	public FreelancerAdapter(Freelancer aFreelancer){
		freelancer=aFreelancer;
	}
	public void attenOffice() {
		System.out.println(freelancer.getName()+"'s has come to office, his Status : "); 
		freelancer.startWork();
	}
	public void joinMeeting() {
		freelancer.remoteConversation();
		System.out.print(" for meeting");		
	}
	public void getDailyReport() {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date aDate = new Date();
		freelancer.getReport(format.format(aDate));
	}
}
