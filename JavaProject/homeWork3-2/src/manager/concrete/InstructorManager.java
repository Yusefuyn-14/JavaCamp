package manager.concrete;

import entities.concrete.Instructor;
import manager.abstracts.Manager;

public class InstructorManager extends Manager {
	public void add(Instructor instructor) {
		System.out.println("Eğitmen " + instructor.getFirstName() + " eklendi.");
	}
	//public void bulkAdd(Instructor[] instructors) {}
	
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen " + instructor.getFirstName() + " silindi.");
	}
	//public void bulkDelete(Instructor[] instructors) {}
	
	public void edit() {}
	
	public void list() {}
	public void listAll() {}
	
}