package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test_1 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sucheta");
		names.add("Pankaj");
		names.add("Adamya");
		names.add("Advik");
		
//		Collections.sort(names, new Comparator<String>() {
//			
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			};
//		});
		
		Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
		
		System.out.println(names);
	}

}
