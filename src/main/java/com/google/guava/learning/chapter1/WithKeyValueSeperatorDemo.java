package com.google.guava.learning.chapter1;

import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class WithKeyValueSeperatorDemo {

	public static void main(String[] args) {
		
		withKeyValueSperatorDemo();
		
	}
	
	public static void withKeyValueSperatorDemo(){
		Map<String, String> map=Maps.newLinkedHashMap();
		map.put("Name", "John");
		map.put("LastName", "Doe");
		map.put("Address", "California");
		// {Name=John, LastName=Doe, Address=California}
		System.out.println(map);
		/**
		 * Here we add , as delimiter.
		 * And then we add : as key value separator.
		 * So output for above map will be
		 * 		Name:John , LastName:Doe , Address:California
		 * */
		String str=Joiner.on(" , ").withKeyValueSeparator(":").join(map);
		System.out.println(str);
	}
	
}
