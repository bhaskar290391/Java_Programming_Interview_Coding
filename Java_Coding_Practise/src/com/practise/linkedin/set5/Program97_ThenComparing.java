package com.practise.linkedin.set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	String lastName;
	int age;

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}

}

public class Program97_ThenComparing {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Ashok", "jadhav", 30), new Person("Anamika", "kashyap", 28),
				new Person("Anamika", "kashyap", 34), new Person("Ashok", "Gore", 30));

		Collections.sort(persons,
				Comparator.comparing(Person::getName).thenComparing(Person::getLastName).thenComparing(Person::getAge));
		System.out.println(persons);
	}
}
