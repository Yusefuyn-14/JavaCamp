package manager.concrete;

import entities.concrete.Student;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Öğrenci " + student.getFirstName() + " eklendi.");
	}
	//public void bulkAdd(Student[] addStudents) {}
	
	public void delete(Student student) {
		System.out.println("Öğrenci " + student.getFirstName() + " silindi.");
	}
	//public void bulkDelete(Student[] deletedStudents) {}
	
	public void edit(Student student) {}
	
	public void list() {}
	public void listAll() {}
}
