package com.google.guava.learning.objects.utils;

import com.google.common.base.MoreObjects;

public class MoreObjectsToStringHelper {

	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setCity("New York");
		person.setState("New York");
		person.setCountry("USA");
		
		String personToString = 
				MoreObjects.toStringHelper(person)
						   .add("firstName", person.getFirstName())
						   .add("lastname", person.getLastName())
						   .add("city", person.getCity())
						   .add("state", person.getState())
						   .add("country", person.getCountry())
						   .toString();

		System.out.println(personToString);
		
	}
}
