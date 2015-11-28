package com.google.guava.learning.chapter1;

import java.util.Iterator;

import com.google.common.base.Splitter;

public class JavaStringSplit {

	public static void main(String[] args) {

		String testString = "Monday,Tuesday,,Wednesday,,Thursday,,";
		String[] output = testString.split(",");
		for (int i = 0; i < output.length; i++) {
			//System.out.print(output[i]);
		}
		
		/**
		 * on method returns new Splitter instance.
		 * So this statement is good to do its job.
		 * */
		Splitter splitter= Splitter.on("|");
		
		/**
		 * Now, Splitter class is immutable.
		 * trimResults() method returns the 
		 * */
		splitter=splitter.trimResults();
		
		/**
		 * Results will contain empty elements.
		 * */
		Iterator<String> part=splitter.split("a1 |b|c|  |  |").iterator();
		int counter=0;
		while(part.hasNext()){
			part.next();
			counter++;
		}
		/**
		 * Prints 5
		 * */
		System.out.println(counter);
	}
}
