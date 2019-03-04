package org.abst;

public class Inter implements I,I1 {

	@Override
	public void bankDetails() {
		System.out.println("address");
		
	}

	@Override
	public void fixedAcc() {
		System.out.println("1%");
		
	}

	@Override
	public void jointAcc() {
		System.out.println("10%");
		
	}
	public static void main(String[] args) {
		Inter i=new Inter();
		i.bankDetails();
		i.fixedAcc();
		i.jointAcc();
	}

}
