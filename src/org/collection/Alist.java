package org.collection;

import java.util.ArrayList;
import java.util.List;

public class Alist {
       public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(14);
		li.add(15);
		li.add(16);
		li.add(17);
		
		System.out.println("normal");
		//normal for loop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
		
		System.out.println("enhanced");
		
		//enhanced for loop
		for (Integer x : li) {
			System.out.println(x);
			
		}
	}
}
