package classcontrol.server.application;
import java.util.ArrayList;
import java.util.List;

import entities.Class;
import entities.Student;

public class ClassControl {

	public static void main(String[] args) {
		classControl();
	}

	private static void fillClassOne(Class classStudent) {
		classStudent.addStudent(new Student(111, "Igor Blue", 23));
		classStudent.addStudent(new Student(112, "Yury Red", 24));
		classStudent.addStudent(new Student(113, "Vini White", 20));
		classStudent.addStudent(new Student(114, "Afonso Black", 21));
		classStudent.addStudent(new Student(115, "Vitor Yellow", 20));
	}
	
	private static void fillClassTwo(Class classStudent) {
		classStudent.addStudent(new Student(211, "Samuel Purple", 19));
		classStudent.addStudent(new Student(212, "Leiticia Pink", 19));
		classStudent.addStudent(new Student(213, "Edmilson Brown", 24));
		classStudent.addStudent(new Student(214, "Fernando Grey", 23));
		classStudent.addStudent(new Student(215, "Tainara Orange", 18));
	}
	
	private static void classControl() {
		List<Class> classList = new ArrayList<>();
		classList.add(new Class(1, "Class 1", 2019));
		classList.add(new Class(2, "Class 2", 2023));
		
		fillClassOne(classList.get(0));
		fillClassTwo(classList.get(1));
		
		classList.forEach(System.out::println);
		ServeControl.SendClass(classList);
	}//classControl

}
