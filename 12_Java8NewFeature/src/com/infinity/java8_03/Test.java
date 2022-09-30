package com.infinity.java8_03;

//Lambda Expression
@FunctionalInterface
interface I1 {
	public int max(int num1, int num2);
}

interface tempInter {
	public void run();
}

public class Test {
	public static void main(String[] args) {
		I1 ref1 = (n1, n2) -> (n1 > n2) ? n1 : n2;
		int res = ref1.max(100, 200);
		System.out.println("Max :- " + res);

		tempInter temp = ()-> {
			System.out.println("run fast with speed ");
		};
		temp.run();
	}
}
