package org.collection;

import java.util.ArrayList;
import java.util.List;

public class UserDefineList {
	
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<>();
		
		Employee e=new Employee();
		e.setEmpId(12);
		e.setEmpName("karthi");
		e.setEmpPh(9877655434l);
		
		Employee e1=new Employee();
		e1.setEmpId(13);
		e1.setEmpName("ajith");
		e1.setEmpPh(877655434l);
		
		li.add(e);
		li.add(e1);
		
		for (Employee x : li) {
			System.out.println(x.getEmpId());
			System.out.println(x.getEmpName());
			System.out.println(x.getEmpPh());
			
		}
	}

}
