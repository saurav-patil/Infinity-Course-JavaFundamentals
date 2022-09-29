package com.infinity.test6;

interface I1 {
	void meth1();
}

interface I2 {
	void meth2();
}

//Multiple interface is possible 
interface I3 extends I1, I2 {
	void meth3();
}

//class can only implement the interface
class C1 implements I3 {

	@Override
	public void meth3() {
		System.out.println("Meth3");

	}

	@Override
	public void meth1() {
		System.out.println("Meth1");

	}

	@Override
	public void meth2() {
		System.out.println("Meth2");

	}

}

public class Test {
	public static void main(String[] args) {
		I3 ref;
		ref = new C1();
		ref.meth1();
		ref.meth2();
		ref.meth3();
	}
}
