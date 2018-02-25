package net.devk.jdk8.tour.lambdas;

import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import net.devk.jdk8.tour.model.Person;

public class ComparatorsTest {

	@Test
	public void testImperativeStyleComparator() {
		List<Person> people = Person.createSampleList();
		Comparator<Person> compareByAge = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		Comparator<Person> compareByName = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		people.sort(compareByAge);
		Assert.assertEquals(people.get(0).getName(), "tom");
		people.sort(compareByName);
		Assert.assertEquals(people.get(0).getName(), "adam");

	}

	@Test
	public void testFunctionalStyleComparator() {
		List<Person> people = Person.createSampleList();
		people.sort((p1, p2) -> p1.getAge() - p2.getAge());
		Assert.assertEquals(people.get(0).getName(), "tom");
		people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
		Assert.assertEquals(people.get(0).getName(), "adam");
	}

}
