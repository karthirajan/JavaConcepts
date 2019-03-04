package org.construct;

import javax.print.DocFlavor.STRING;

public class B {
	
	public B() {
		this("karthi");
		System.out.println("DEFAULT OF SUPER CLASS");
	}
     
	
	public B(String name) {
		System.out.println(name);
	}
}
