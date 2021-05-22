
import manager.concrete.*;
import entities.concrete.*;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		Student student = new Student();
		student.setUserID(0);
		student.setFirstName("Ahmet");
		student.setLastName("Metin");
		String[] dontCompletedCamps = {"c#"};
		student.setDontCompletedCamps( dontCompletedCamps );
		String[] completedCamps = {"Java"};
		student.setCompletedCamps( completedCamps );
		
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setUserID(0);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setCategory("Yazılım");
		String[] trainings = {"CSharp" , "Java"};
		instructor.setCamps( trainings );

		instructorManager.add(instructor);
		
	}
}
