package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateAlwaysFalseDemo {

	public static void main(String[] args) {

		Predicate<String> pred = alwaysFalseDemo();
		System.out.println(pred.apply("10"));
		System.out.println(pred.apply(""));
		System.out.println(pred.apply(null));
	}

	/**
	 * Predicates.alwaysFalse() returns Predicate<T> which
	 * always evaluates to FALSE regardless to any 
	 * passed to apply(T input).
	 * 
	 * returns the Predicate<T>
	 * */
	public static <T> Predicate<T> alwaysFalseDemo() {
		return Predicates.alwaysFalse();
	}

}
