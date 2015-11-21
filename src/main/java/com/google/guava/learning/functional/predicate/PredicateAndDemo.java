package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateAndDemo {

	public static void main(String[] args) {

		Predicate<Integer> pred = Predicates.and(isEven(), greaterThan(30));
		System.out.println("20 pred :" + pred.apply(20));
		System.out.println("30 pred :" + pred.apply(30));
		System.out.println("31 pred :" + pred.apply(31));
		System.out.println("32 pred :" + pred.apply(32));
	}

	/**
	 * isEven(int input) method returns a Predicate<Integer>
	 * which returns true for even numbers
	 * and returns false for odd numbers.
	 * */
	public static 
	Predicate<Integer> isEven() {
		return 
		new Predicate<Integer>() {
			public boolean apply(Integer input) {
				return input.intValue() % 2 == 0;
			}
		};
	}
	
	/**
	 * greaterThan(int number) method returns a Predicate<Integer>
	 * which returns true if number is greater than input
	 * provided in apply(T input).
	 * */
	public static 
	Predicate<Integer> greaterThan(final int number){
		return
		new Predicate<Integer>() {
			public boolean apply(Integer input) {
				return input.intValue() > number;
			}
		};
	}

}