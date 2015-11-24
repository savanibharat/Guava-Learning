package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateNotNullDemo {

	public static void main(String[] args) {

		Predicate<String> pred = notNullDemo();
		System.out.println(pred.apply("10"));
		System.out.println(pred.apply(""));
		System.out.println(pred.apply(null));
	}
	
	/**
	 * Predicates.notNull() returns Predicate<T> which
	 * evaluates to true if the object reference
	 * being tested is NOT null.
	 * 
	 * returns the Predicate<T>
	 * */
	public static <T> Predicate<T> notNullDemo() {
		return Predicates.notNull();
	}

}
