package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carols", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)

		);

		Collections.sort(list, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		//printConditionally(list, p -> true);
		printConditionally(list, p -> p.getLastName().startsWith("C"), p->System.out.println(p));
		// System.out.println(list);
	}

	private static void printConditionally(List<Person> list, Predicate<Person> condition, Consumer<Person> consumer) {
		for (Person p : list) {
			if (condition.test(p)) {
				//System.out.println(p);
				consumer.accept(p);
			}
		}
	}
}

/*interface Condition {
	boolean test(Person p);
}*/