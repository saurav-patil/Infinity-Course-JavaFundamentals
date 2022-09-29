package com.infinity.test3;

class Demo {
	int x;

	Demo(int x) {
		System.out.println("constructor is called..");
		this.x = x;
	}

	@Override
	public void finalize() {
		System.out.println("Cleaning up work.");
	}
}

public class Test {

	public static void main(String[] sargs) {
		Demo obj1 = new Demo(100);
		Demo obj2 = new Demo(200);

		obj1 = null;
		System.gc();

	}
}
