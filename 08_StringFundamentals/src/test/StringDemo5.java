package test;

public class StringDemo5 {

	public static void main(String[] args) {
		System.out.println("Program is started");
		String str1 = "Hello";
		long start = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
			str1 = str1 + "W";
		}
		// 100000 objects will be created unknowingly
		long end = System.currentTimeMillis();
		System.out.println("Time taken to execute " + (end - start) + "ms");
	}

}
