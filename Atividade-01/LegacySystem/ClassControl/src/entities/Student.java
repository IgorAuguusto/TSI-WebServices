package entities;

public class Student {
	private int registration;
	private String name;
	private int age;

	public Student() {
	}

	public Student(int registration, String name, int age) {
		this.registration = registration;
		this.name = name;
		this.age = age;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("\n\t- %s, %d years, registration %d", name, age, registration);
	}
	
}//class Student
