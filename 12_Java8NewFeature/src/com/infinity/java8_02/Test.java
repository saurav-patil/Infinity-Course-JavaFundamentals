package com.infinity.java8_02;

@FunctionalInterface
interface I1 {
	void meth1();
}
//create a class and implement a interface
//Overide the method
//define the body for that method
class Impl implements I1 {
	@Override
	public void meth1() {
	}
}

public class Test {
	public static void main(String[] args) {
		I1 ref = new Impl();
		ref.meth1();
		// using anonymous class
		// class which has no name that is called anonymous class
		// we don't have to create additional class
		// define the body
		I1 ref2 = new I1() {
			@Override
			public void meth1() {
				System.out.println("Meth 1 of anonymous class");
			}
		};
		ref2.meth1();
	}
}
