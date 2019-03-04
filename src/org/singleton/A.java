package org.singleton;

public class A {
	private static A emp=null;
	
	private A() {
		// TODO Auto-generated constructor stub
	}
	
	public static A getInstance() {
		if (emp==null) {
			emp=new A();
			
		}
		System.out.println(emp);
		return emp;
		
	}
	public void x() {
		System.out.println("test1");

	}
	public void y() {
		System.out.println("test2");

	}

}
