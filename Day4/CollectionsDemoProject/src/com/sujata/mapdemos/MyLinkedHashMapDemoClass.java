package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMapDemoClass {

	public static void main(String[] args) {

/*
 * ordered collection of key value pair which is autogrowable and autoshrinkable,
 * where keys are unique and values can be duplicate
 * and ordering as per key
 */
		Map<String, Integer> months=new LinkedHashMap<String, Integer>();
		
		months.put("Jan", 31);
//		months.put("Feb", 56);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		months.put("Jun", 30);
		
		System.out.println(months);
		
		months.put("Feb", 29);
		System.out.println(months);
		
		Set<String> monthsName= months.keySet();
		for(String monthName:monthsName) {
			System.out.println(monthName+" has "+months.get(monthName)+" days");
		}
		
		
	}

}
