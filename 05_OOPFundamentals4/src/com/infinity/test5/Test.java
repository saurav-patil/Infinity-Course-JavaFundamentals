package com.infinity.test5;

interface I1 {
	void meth1();
}

interface I2 {
	void meth2();
}

class C1 implements I1, I2 {

	@Override
	public void meth2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub

	}

}

public class Test {

	public static void main(String[] args) {
		I1 ref1 = new C1();
		I2 ref2 = new C1();

		ref1.meth1();
		ref2.meth2();

	}

}
