package com.google.guava.learning.chapter1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.common.base.Joiner;

public class FileWriterAndDates {

	public static void main(String[] args) throws Exception {
		FileWriter fw=joinFileWriterAndDates();
	}
	
	public static FileWriter joinFileWriterAndDates() throws Exception{
		FileWriter fw=new FileWriter(new File("abc.txt"));
		List<Date> dateList=new ArrayList<Date>(Arrays.asList(new Date(), new Date()));
		Joiner joiner=Joiner.on("#").useForNull(" ");
		return joiner.appendTo(fw, dateList);
	}
	
	
}
