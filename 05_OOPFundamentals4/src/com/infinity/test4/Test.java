package com.infinity.test4;

interface I1 {
	void meth1();// automatically interface's methods are public and abstract

	public abstract void meth2(); //No implementation of abstract method/ child classes responsibility to implement them 
}

class C1 implements I1 {
	@Override
	public void meth1() {
		System.out.println("meth1");
	}

	@Override
	public void meth2() {
		System.out.println("meth2");
	}
}


public class Test {

	public static void main(String[] args) {
		I1 obj;
		obj = new C1();

		obj.meth1();
		obj.meth2();
	}

}
