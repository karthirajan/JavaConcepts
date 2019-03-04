package org.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefineMap {
	public static void main(String[] args) {
		Map<Integer, Employee> emp=new HashMap<>();
		
		Employee e=new Employee();
		e.setEmpId(12);
		e.setEmpName("karthi");
		e.setEmpPh(9877655434l);
		
		Employee e1=new Employee();
		e1.setEmpId(13);
		e1.setEmpName("ajith");
		e1.setEmpPh(877655434l);
		
		emp.put(10, e);
		emp.put(20, e1);
		
		Set<Entry<Integer, Employee>> s = emp.entrySet();
		for (Entry<Integer, Employee> entry : s) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getEmpId());
			System.out.println(entry.getValue().getEmpName());
			System.out.println(entry.getValue().getEmpPh());
			
		}
	}

}
