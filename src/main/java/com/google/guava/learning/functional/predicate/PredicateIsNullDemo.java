package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateIsNullDemo {

	public static void main(String[] args) {

		Predicate<String> pred = isNullDemo();
		System.out.println(pred.apply("10"));
		System.out.println(pred.apply(""));
		System.out.println(pred.apply(null));

	}

	/**
	 * Predicates.isNull() returns Predicate<T> which
	 * evaluates to true if the object reference 
	 * being tested IS null.
	 * 
	 * returns the Predicate<T>
	 * */
	public static <T> Predicate<T> isNullDemo() {
		return Predicates.isNull();

	}

}
