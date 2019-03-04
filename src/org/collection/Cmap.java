package org.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cmap {
	
	public static void main(String[] args) {
		Map<Integer, String> emp=new HashMap<>();
		emp.put(10, "karthi");
		emp.put(20, "java");
		emp.put(30, "selenium");
		emp.put(40, "project");
		
		Set<Entry<Integer, String>> e = emp.entrySet();
		for (Entry<Integer, String> entry : e) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
	}

}
