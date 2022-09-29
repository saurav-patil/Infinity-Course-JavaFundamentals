package com.infinity.exception02;

import java.io.IOException;

public class Test {

	public void meth1(int arg1) {
		System.out.println("Meth1 is called");
		if (arg1 < 0) {
			// throw throwable_instance;
			throw new IllegalArgumentException("Only Positive number are allowed in meth 1");
		}
		System.out.println("Positive number " + arg1);
	}

	public void meth2(int arg1) throws IOException {
		System.out.println("Meth2 is called");
		if (arg1 < 0) {
			throw new IOException("Only Positive number are allowed in meth2");
		}
		System.out.println("Positive number " + arg1);

	}

	public static void main(String[] args) {

		Test test = new Test();

		try {
			test.meth1(-2);
			System.out.println("-------------------------");

			test.meth2(-2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of Program");
	}

}
