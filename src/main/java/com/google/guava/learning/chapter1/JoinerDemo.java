package com.google.guava.learning.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;
/**
 * Joiner class - object which joins pieces of text specified as an 
 * array, Iterable, varargs or Map with a separator. 
 * 
 * It either appends the results to an Appendable or returns them
 * as a String.
 * */
public class JoinerDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(
				Arrays.asList("Mon", null, "Tues", "Wed"));
		System.out.println("Skip nulls "+joinUsingGuavaJoiner(list, "|"));
		
		System.out.println("Use for null "+joinUsingGuavaJoinerUseForNull(list,"|"));
	}
	
	/**
	 * In this method we write the code to join the list of Strings 
	 * or List<String> with a delimiter.
	 * So, Example 1
	 * 		List is ["Monday","Tuesday","Wednesday"]
	 * 		delimiter is "|"
	 * Output
	 * 		Monday|Tuesday|Wednesday
	 * 
	 * Example 2
	 * 		List is ["Mon", null,"Tues", "Wed"]
	 * 		delimiter is "|"
	 * Output
	 * 		Mon||Tues|Wed
	 * null are to be avoided.
	 * */
	public static String joinDelimiter(final List<String> strList,final String delimiter) {

		StringBuilder sb = new StringBuilder();
		Iterator<String> iter = strList.iterator();
		while (iter.hasNext()) {
			String string = iter.next();
			if (string != null) {
				sb.append(string).append(delimiter);
			}
		}
		sb.setLength(sb.length()-delimiter.length());
		return sb.toString();
	}
	
	/**
	 * Now let us solve this using Google Guava.
	 * 
	 * Joiner class's on method returns new Joiner(separator);
	 * 
	 * Then it used skipNulls() to skip null elements in List.
	 * 
	 * Then join method is used to join delimiter between 
	 * two elements of list.
 	 * */
	public static String joinUsingGuavaJoiner(List<String> strList, String delimiter){
		return Joiner.on("|").skipNulls().join(strList);
	}
	
	/**
	 * This method is similar to above except one difference.
	 * 
	 * In above method we skipped the null elements in list.
	 * 
	 * But in this method we will use some nullText to denote 
	 * the null element in List.
 	 * */
	public static String joinUsingGuavaJoinerUseForNull(List<String> list, String delimiter){
		return Joiner.on("|").useForNull("#").join(list);
	}
}
