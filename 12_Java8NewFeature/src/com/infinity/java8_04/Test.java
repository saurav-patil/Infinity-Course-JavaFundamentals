package com.infinity.java8_04;
@FunctionalInterface
interface I1 {
	public int max(int num1, int num2);
}
public class Test {
	public static void main(String[] args) {
		I1 ref1 = (int n1, int n2) -> {
			if (n1 > n2)
				return n1;
			else
				return n2;
		};
		I1 ref2 = (x, y) -> {
			int res2 = (x > y) ? x : y;
			return res2;
		};
		I1 ref3 = (n1, n2) -> (n1 > n2) ? n1 : n2;
		
		int result1 = ref1.max(10, 20);
		System.out.println(result1);

		int result2 = ref2.max(10, 20);
		System.out.println(result2);

		int result3 = ref3.max(10, 20);
		System.out.println(result3);

	}

}
