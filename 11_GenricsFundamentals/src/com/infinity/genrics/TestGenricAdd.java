package com.infinity.genrics;

public class TestGenricAdd {

	public <T> void add(T arg1, T arg2) {
		if (arg1 instanceof Integer && arg2 instanceof Integer) {
			int num1 = ((Integer) arg1).intValue();
			int num2 = ((Integer) arg2).intValue();
			System.out.println("Addition of two int : " + (num1 + num2));
		} else if (arg1 instanceof Double && arg2 instanceof Double) {
			double num1 = ((Double) arg1).doubleValue();
			double num2 = ((Double) arg2).doubleValue();
			System.out.println("Addition of two Double : " + (num1 + num2));
		} else if (arg1 instanceof String && arg2 instanceof String) {
			String str1 = ((String) arg1).toString();
			String str2 = ((String) arg2).toString();
			System.out.println("Addition of two String : " + (str1+" "+ str2));
		}
	}
	public static void main(String[] args) {
		TestGenricAdd obj = new TestGenricAdd();
		obj.add(100, 200);
		obj.add(10.5, 11.5);
		obj.add("Virat", "Kohli");
	}

}
