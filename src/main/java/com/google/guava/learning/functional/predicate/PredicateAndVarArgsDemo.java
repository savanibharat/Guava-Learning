package com.google.guava.learning.functional.predicate;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateAndVarArgsDemo {

	public static void main(String[] args) {
		/**
		 * First give example of string is not null 
		 * length is > than 5 
		 * all chars are caps
		 */
		
		List<String> list = 
				Arrays.asList("actualize", null, "skillful", 
							  "abhorrent", null, "commercialize");
		
		Predicate<String> andPred = Predicates.and(notNull(), endsWith("ize"));
		
		for (String word : list) {
			System.out.println(word + " -> " + andPred.apply(word));
		}
	}

	public static Predicate<String> notNull() {
		return new Predicate<String>() {
			public boolean apply(final String input) {
				return input != null;
			}
		};
	}

	public static 
	Predicate<String> lengthGreater(final int length) {
		return new Predicate<String>() {
			public boolean apply(final String input) {
				return 
						input != null && 
						input.length() > length;
			}
		};
	}
	
	public static 
	Predicate<String> endsWith(final String endsWithString) {
		return new Predicate<String>() {
			public boolean apply(final String input) {
				if (input == null || endsWithString == null) {
					return false;
				} else if (input.length() < endsWithString.length()) {
					return false;
				}
				return input.endsWith(endsWithString);
			}
		};
	}

}
