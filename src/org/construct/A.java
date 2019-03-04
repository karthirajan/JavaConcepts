package org.construct;

public class A extends B {
	
	public A() {
		this(12);
		System.out.println("default of sub class");
	}
    
	
	public A(int id) {
		super();
		System.out.println("id is :"+id);
	}
	public static void main(String[] args) {
		A a=new A();
	}
}
