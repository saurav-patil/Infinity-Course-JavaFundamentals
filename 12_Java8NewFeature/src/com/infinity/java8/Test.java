package com.infinity.java8;

interface NewFeature {
	public abstract void meth1();
	// Default introduced in java 8
	default public void meth2() {
		System.out.println("Default Method -2 from interface");
		meth4();
	}

	// Static introduced in java 8 // Cannot override Static method
	static public void meth3() {
		System.out.println("Static Method -3 from interface");
	}

	// Introduced in java 9 maybe
	private void meth4() {
		System.out.println("Private Method -4 from interface");
	}
}

class Impl implements NewFeature {
	@Override
	public void meth1() {
		System.out.println("Meth1 of class Impl");
	}
}

public class Test {
	public static void main(String[] args) {
		NewFeature obj = new Impl();
		obj.meth1();
		obj.meth2();
		//obj.meth3(); // Not possible to call static method with help of ref
		NewFeature.meth3(); //way to call static method
	}
	
}
