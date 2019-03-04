package org.exception;

public class B {
	public static void main(String[] args) {
		
		try {
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("dont divide by zero");
		}finally {
			System.out.println("always");
		}
	}

}
