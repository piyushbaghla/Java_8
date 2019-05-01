package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Excercise {
	public static void main(String[] args) {

		List<Person> list = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carols", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)

		);

		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().compareTo(o2.getLastName());
			}

		});
		//System.out.println(list);
		printLastNamePerson(list);
	}
	private static void printLastNamePerson(List<Person> list){
		for(Person person:list) {
			if(person.getLastName().startsWith("C")) {
				System.out.println(person);
			}
		}
	}
}
