package com.google.guava.leaning.blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,
				5, 6, 7));
		int[] arr = listToPrmitiveArrayGoogleGuava(ints);
	}

	/**
	 * THis method uses Ints class of Google Guava for conversion of
	 * List<Integer> to int[]
	 **/
	public static int[] listToPrmitiveArrayGoogleGuava(List<Integer> ints) {

		int[] arr = Ints.toArray(ints);
		return arr;
	}

}
