package test;

public class StringBufferDemo6 {

	public static void main(String[] args) {
		System.out.println("Program is started");
		// String str1 = "Hello";
		StringBuffer str1 = new StringBuffer("Hello");
		// stringBuffer is mutable

		long start = System.currentTimeMillis();
		for (int i = 1; i < 100; i++) {
			str1 = str1.append("W");
		}
		// instead using stringBuffer or stringBuilder
		//only single object is created
		long end = System.currentTimeMillis();
		System.out.println("Time taken to execute " + (end - start) + "ms");
	}

}
