package org.collection;

import java.util.HashSet;
import java.util.Set;

public class Bset {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(12);
		s.add(13);
		s.add(14);
		s.add(15);
		
		for (Integer x : s) {
			System.out.println(x);
			
		}
	}

}
