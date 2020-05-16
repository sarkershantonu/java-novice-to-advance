package org.practice.adapter;

public class Application {
	public static void main(String[] args) {
		Employee aExsistEmployee = new FullTimeEmployee("Mr. David");
		Freelancer aFreelancer = new Freelancer("Shantonu Sarker");
		Employee adapter = new FreelancerAdapter(aFreelancer);
		System.out.println("\n"+"This is sytem exist full time employee");
		aExsistEmployee.attenOffice();
		aExsistEmployee.joinMeeting();
		aExsistEmployee.getDailyReport();
		
		System.out.println("\n"+"This is new freelancer");
		aFreelancer.startWork();
		aFreelancer.remoteConversation();
		
		System.out.println("\n"+"This is freelancer and frelancerAdapter");
		adapter.attenOffice();
		adapter.getDailyReport();
		adapter.joinMeeting();	
	}
}
