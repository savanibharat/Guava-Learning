package com.google.guava.learning.functional.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PredicateAndIterableDemo {

	public static void main(String[] args) {
		/**
		 * First give example of string is not null 
		 * length is > than 5 
		 * all chars are caps
		 */
		
		List<String> list = Arrays.asList("actualize", null, "skillful", 
										  "abhorrent", null, "commercialize");
		
		List<Predicate<String>> pred = new ArrayList<Predicate<String>>();
		pred.add(notNull());
		pred.add(endsWith("ize"));		
		Predicate<String> allPreds= Predicates.and(pred);
		
		for (String word : list) {
			System.out.println(word + " -> " + allPreds.apply(word));
		}
	}

	public static Predicate<String> notNull() {
		return new Predicate<String>() {
			public boolean apply(final String input) {
				return input != null;
			}
		};
	}

	public static Predicate<String> lengthGreater(final int length) {
		return new Predicate<String>() {
			public boolean apply(final String input) {
				return 
						input != null && 
						input.length() > length;
			}
		};
	}
	
	public static Predicate<String> endsWith(final String endsWithString) {
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
