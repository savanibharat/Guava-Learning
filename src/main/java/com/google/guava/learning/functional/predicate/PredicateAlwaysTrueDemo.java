package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateAlwaysTrueDemo {

	public static void main(String[] args) {
		
		Predicate<String> pred = alwaysTrueDemo();
		System.out.println(pred.apply("10"));
		System.out.println(pred.apply(""));
		System.out.println(pred.apply(null));
	}

	/**
	 * Predicates.alwaysFalse() returns Predicate<T> which
	 * always evaluates to TRUE regardless to any input
	 * passed to apply(T input).
	 * 
	 * returns the Predicate<T>
	 * */
	public static <T> Predicate<T> alwaysTrueDemo(){
		return Predicates.alwaysTrue();
	}
	
}
