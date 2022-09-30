package com.infinity.java8_04;

@FunctionalInterface
interface I2 {
	public void print(String str);
}
public class Test2 {
	public static void main(String[] args) {
		I2 ref1 = (String str) -> {
			System.out.print(str);
		};
		ref1.print("Infinity");

		I2 ref2 = (s) -> System.out.print(" " + s);
		ref2.print("Classess");

		I2 ref3 = s -> System.out.print(" " + s);
		ref3.print("Uran");

	}
}
