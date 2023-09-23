package entities;

public class Class {
	private int id;
	private String name;
	private int year;
	private Student[] arrayStudent;
	private int numberOfStudents;
	
	public Class() {
		arrayStudent = new Student[5];
		numberOfStudents = 0;
	}

	public Class(int id, String name, int year) {
		this();
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Student[] getArrayStudent() {
		return arrayStudent;
	}

	/**
	 * Adds a new student to the array of students.
	 * 
	 * @param student The student object to be added.
	 * @return true if the student was successfully added, or false if the array is already full.
	 */
	public boolean addStudent(Student student) {
		if (numberOfStudents == 5) {
			return false;
		}
		arrayStudent[numberOfStudents++] = student;
		return true;
	}
	
	@Override
	public String toString() {
		var sb = new StringBuilder();
		sb.append(String.format("\n%s %d (%d)\n", name, id, year));
		for (Student student : arrayStudent) {
			sb.append(student.toString());
		}
		return sb.toString();
	}
	
}//class Class
