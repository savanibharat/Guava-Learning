package com.google.guava.learning.chapter1;

import java.util.Iterator;
import java.util.Map;

import com.google.common.base.Splitter;

public class SplitterGuava {

	public static void main(String[] args) {

		String testString = "Monday,   ,Tuesday  ,Wednesday  ,Thursday  ";
		//splitterOn(testString);
		//System.out.println();
		//splitterOnLimitDemo(testString);
		//System.out.println();
		mapSplitter();
	}

	/**
	 * This method is used to Split the test String on 
	 * , as delimiter. 
	 * Remember the output might contains empty strings as
	 * we are not trimming the results.
	 * */
	public static void splitterOn(String testString) {
		Iterator<String> str = Splitter.on(",").split(testString).iterator();
		System.out.println("Input String:: "+testString);
		while (str.hasNext()) {
			String temp=str.next();
			System.out.println(temp);
		}
	}

	/**
	 * This method is used to Split the test String on 
	 * , as delimiter. 
	 * Remember the output will still contain empty strings
	 * even we are using trimResults() method.
	 * 
	 * To remove the empty strings we are using the omitEmptyStrings()
	 * method.
	 * */
	public static void splitterOnTrimResults(String testString) {
		System.out.println("Input String:: "+testString);
		Splitter splitter = Splitter.on(",").trimResults().limit(3).omitEmptyStrings();
		Iterator<String> iter = splitter.split(testString).iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	/**
	 * This method is used to Split the test String on 
	 * , as delimiter. 
	 * Remember the output will still contain empty strings
	 * even we are using trimResults() method.
	 * 
	 * To remove the empty strings we are using the omitEmptyStrings()
	 * method.
	 * 
	 * We are also using limit method that will split the string
	 * the number of time specified in parameter.
	 * */
	public static void splitterOnLimitDemo(String testString) {
		System.out.println("Input String:: "+testString);
		Splitter splitter = Splitter.on(",").trimResults().limit(3).omitEmptyStrings();
		Iterator<String> iter = splitter.split(testString).iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	/**
	 * This method is used to split the string in key-value pair.
	 * So the input is the string with key-value seperator 
	 * followed by Entry separator.
	 * */
	public static void mapSplitter() {
		String startString = "A=1#B=2#C=3";
		System.out.println(startString);

		Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
		Map<String, String> map = mapSplitter.split(startString);
		System.out.println(map);
	}
}
