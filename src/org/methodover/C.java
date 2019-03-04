package org.methodover;

public class C extends B {
	
	@Override
	public void bankLoc() {
		System.out.println("trichy");
	}
	public static void main(String[] args) {
		B b=new C();
		b.bankLoc();
		b.savAcc();
	}

}
