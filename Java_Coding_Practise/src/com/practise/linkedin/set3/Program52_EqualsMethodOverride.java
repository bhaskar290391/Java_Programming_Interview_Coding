package com.practise.linkedin.set3;

class Student {
	private String name;
	private int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object object) {

		if (this == object) {
			return true;
		}

		if (object == null && getClass() != object.getClass()) {
			return false;
		}

		Student student = (Student) object;
		return this.id == student.id && this.name.equals(student.name);
	}

}

public class Program52_EqualsMethodOverride {
	public static void main(String[] args) {

		Student stud = new Student("Bhaskar", 29);
		Student stud1 = new Student("Bhaskar", 29);

		Student stud2 = new Student("Sammy", 23);

		System.out.println(stud.equals(stud1));
		System.out.println(stud.equals(stud2));

	}
}
