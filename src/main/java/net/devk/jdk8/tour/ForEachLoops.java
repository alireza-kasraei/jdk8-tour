package net.devk.jdk8.tour;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLoops {

	private static List<String> names = Arrays.asList("john", "tom", "bill", "steve");

	public static void main(String[] args) {

		// imperative style
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for (String name : names) {
			System.out.println(name);
		}

		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});

		// functional

		names.forEach(name -> System.out.println(name));

		names.forEach(System.out::println);

	}

}
