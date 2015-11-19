package com.google.guava.learning.functional.predicate;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateNotDemo {

	public static void main(String[] args) {
		System.out.println(isOdd().apply(2));
		System.out.println(isOdd().apply(3));
		System.out.println(isOdd().apply(4));
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
	 * isOdd(int input) method returns a Predicate<Integer>
	 * which returns true for odd numbers
	 * and returns false for even numbers.
	 * */
	public static 
	Predicate<Integer> isOdd() {
		return Predicates.not(isEven()); 
	}
}