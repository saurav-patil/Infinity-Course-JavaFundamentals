package com.infinity.test2;

//Cannot override final method in child class.
class A {
	public final void show() {

	}
}

final class B extends A {
//	@Override
//	public void show() {
//
//	}
}

//Cannot inherit final class.

//class C extends B{
//	
//}

public class Test {

	public static void main(String[] args) {
		final int x = 100;// used to declare constant in java.

		//Declared as constant
		//x = 200;
	}

}
