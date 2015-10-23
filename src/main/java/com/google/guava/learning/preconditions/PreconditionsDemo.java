package com.google.guava.learning.preconditions;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {

	public static void main(String[] args) {
		checkElementIndex(12, 11);
	}

	public static void doubleEven(final int a) {

		boolean isEven = (a % 2 == 0);
		Preconditions.checkArgument(isEven, "Input %s should be even", a);
		int multiply = a * 2;
		System.out.println(multiply);
	}
	
	public static int length(final String str) {

		Preconditions.checkNotNull(str);
		return str.length();
	}
	
	public static void checkIndex(final int val1, final int size){
		Preconditions.checkPositionIndex(val1, size);
	}
	
	public static void checkPositionIndexes(final int start, final int end, final int size){
		Preconditions.checkPositionIndexes(start, end, size);
	}
	
	public static void checkElementIndex(final int index, final int size){
		Preconditions.checkElementIndex(index, size);
	}
	
/*	public static void checkState() {
		Preconditions.checkState(field.isEmpty());
	}
*/	
	/*public static void doubleEven(final int a) {

		boolean isEven = (a % 2 == 0);
		Preconditions.checkArgument(isEven, "Number %s is not even.", a);
		int multiply = a * 2;
		System.out.println(multiply);
	}

	
	public static void doubleEven(final int a) {

		boolean isEven = (a % 2 == 0);
		Preconditions.checkArgument(isEven, "Number %s is not even.", a);
		int multiply = a * 2;
		System.out.println(multiply);
	}*/

}
