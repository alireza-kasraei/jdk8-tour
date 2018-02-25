package net.devk.jdk8.tour.streams;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FiltersTest {

	private static List<String> names = Arrays.asList("john", "jack", "juli", "tom", "peter");

	@Test
	public void shouldReturnThreeElements() {
		Assert.assertEquals(names.stream().filter(s -> s.startsWith("j")).count(), 3);
	}

}
