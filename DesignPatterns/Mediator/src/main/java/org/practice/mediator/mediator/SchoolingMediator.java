package org.practice.mediator.mediator;

import org.practice.mediator.products.Employee;
import org.practice.mediator.quantifier.Knowledge;

import java.util.ArrayList;
//A mediator who manage schooling and stores every possible transaction inside of IT
public class SchoolingMediator implements Mediator {
	private ArrayList<Knowledge> allTeachingOffers = null;
	private ArrayList<Knowledge> alllearningRequests = null;
	private ArrayList<Employee> allEmployees = null;
	private int employeeCode = 0;
	public SchoolingMediator(){
		allTeachingOffers = new ArrayList<Knowledge>();
		alllearningRequests = new ArrayList<Knowledge>();
		allEmployees = new ArrayList<Employee>();		
	}
	
	public void addEmployee(Employee employee) {
		allEmployees.add(employee);
		employeeCode++;
		employee.setEmployeeCode(employeeCode);
	}
	public void getAllTrainings(){
		System.out.println("\nThese are Teaching Offers ");
		for(Knowledge aKnolwdge : allTeachingOffers){
			System.out.println(aKnolwdge.getSubject()+" for "+aKnolwdge.getHour()+" Hrs");
		}
		System.out.println("\nThese are learning Requests ");
		for(Knowledge aKnolwdge : alllearningRequests){
			System.out.println(aKnolwdge.getSubject()+" for "+aKnolwdge.getHour()+" Hrs");
		}
	}
	public void giveKnowledge(String subject, int hour, int employeeCode) {
		boolean knowledgeGiven = false;
		for(Knowledge aTeachingingSubject:alllearningRequests){
			//now, we check if requested learning subject and hour matches any of available Teaching subject and hour
			if(aTeachingingSubject.getSubject()==subject&&aTeachingingSubject.getHour()==hour){
				System.out.println("\n"+hour+" hour(s) subject \""+subject+"\" is taught by ID "+employeeCode+" , and learned by id "+aTeachingingSubject.getEmployeeCode());
				alllearningRequests.remove(aTeachingingSubject);//removing learned subject
				knowledgeGiven=true;
			}
			if(knowledgeGiven){//if any one give the knowledge
				break;
			}
		}
		if(!knowledgeGiven){//if no knowledge is given , it will be added in Teaching offers
			System.out.println(subject+" is added in the Teaching offers and time(hrs) is "+hour);
			allTeachingOffers.add(new Knowledge(subject, hour, employeeCode));
		}				
	}
	
	public void getKnowledge(String subject, int hour, int employeeCode) {
		boolean knowledgeLearn = false;
		for(Knowledge aLearningSubject:allTeachingOffers){
			//now, we check if requested learning subject and hour matches any of available Teaching subject and hour
			if(aLearningSubject.getSubject()==subject&&aLearningSubject.getHour()==hour){
				System.out.println("\n"+hour+" hour(s) subject \""+subject+"\" is learned by ID "+employeeCode+" , and taught by id "+aLearningSubject.getEmployeeCode());
				allTeachingOffers.remove(aLearningSubject);//removing learned subject
				knowledgeLearn=true;
			}
			if(knowledgeLearn){//if any one get the knowledge
				break;
			}
		}
		if(!knowledgeLearn){//if no knowledge is delivered , it will be added in learning requests.
			System.out.println(subject+" is added in the learning requests and time(hrs) is "+hour);
			alllearningRequests.add(new Knowledge(subject, hour, employeeCode));
		}		
	}
}
