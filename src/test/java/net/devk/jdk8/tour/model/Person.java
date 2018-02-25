package net.devk.jdk8.tour.model;

import java.util.Arrays;
import java.util.List;

public class Person {

	private final String name;
	private final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<Person> createSampleList() {
		return Arrays.asList(new Person("adam", 30), new Person("john", 32), new Person("ali", 30),
				new Person("tom", 29), new Person("jack", 31));
	}

}
