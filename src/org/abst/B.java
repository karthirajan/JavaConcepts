package org.abst;

public class B extends A {

	@Override
	public void bankInterset1() {
	System.out.println("100%");
		
	}

	@Override
	public void bankInterset2() {
		System.out.println("200%");
		
	}

	@Override
	public void bankInterset3() {
		System.out.println("300%");
		
	}
	public static void main(String[] args) {
		A a=new B();
		a.bank();
		a.bankInterset1();
		a.bankInterset2();
		a.bankInterset3();
	}

}
