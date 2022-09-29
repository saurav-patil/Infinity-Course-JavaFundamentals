package com.infinity.genrics;

public class TestGenricMethods {

	public static <T> void genricMethod(T arg1, T arg2) {
		System.out.println("Argument 1: " + arg1);
		System.out.println("Argument 2: " + arg2);
		if (arg1 instanceof Integer)
			System.out.println("Integer argument");
		else if (arg1 instanceof Double) {
			System.out.println("Double argument");
		} else if (arg1 instanceof String) {
			System.out.println("String argument");
		} else {
			System.out.println("Other type");
		}
		System.out.println("-----------------------------------------------");
	}

	public static void main(String[] args) {
		genricMethod(100, 200);
		genricMethod(10.5, 11.5);
		genricMethod("str1", "str2");
	}

}
