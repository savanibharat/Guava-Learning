package com.google.guava.learning.test.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.guava.learning.chapter1.JoinerDemo;

import junit.framework.Assert;
import junit.framework.TestCase;

public class JoinerDemoTest extends TestCase{

	List<String> list1=new ArrayList<String>(
			Arrays.asList("Monday",	"Tuesday", "Wednesday"));
	
	String output1 = "Monday|Tuesday|Wednesday";

	List<String> list2 = new ArrayList<String>(
			Arrays.asList("Mon", null, "Tues", "Wed"));
	
	String output2="Mon|Tues|Wed";
	
	String output3="Mon|#|Tues|Wed";
	
	public static final String DELIMITER="|";
	
	/**
	 * Method written without Joiner class API
	 * List does not contain null
	 * */
	public void testJoinDelimiter() {
		Assert.assertEquals(output1, JoinerDemo.joinDelimiter(list1, DELIMITER));
	}

	/**
	 * Method written without Joiner class API
	 * List does contains null
	 * */
	public void testJoinDelimiterWithNull() {
		Assert.assertEquals(output2, JoinerDemo.joinDelimiter(list2, DELIMITER));
	}
	
	/**
	 * Method written using Joiner class API
	 * List does not contain null
	 * */
	public void testjoinUsingGuavaJoiner() {
		Assert.assertEquals(output1, JoinerDemo.joinUsingGuavaJoiner(list1, DELIMITER));
	}
	
	/**
	 * Method written using Joiner class API
	 * List does contains null
	 * */
	public void testjoinUsingGuavaJoinerNull() {
		Assert.assertEquals(output2, JoinerDemo.joinUsingGuavaJoiner(list2, DELIMITER));
	}
	
	/**
	 * Method written using Joiner class API
	 * List does contains null
	 * We represent null using null
	 * */
	public void testjoinUsingGuavaJoinerNullText() {
		Assert.assertEquals(output3, JoinerDemo.joinUsingGuavaJoinerUseForNull(list2, DELIMITER));
	}
}
