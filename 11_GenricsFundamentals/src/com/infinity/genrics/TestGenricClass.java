package com.infinity.genrics;

class Test<T> {
	private T obj;

	public Test(T obj) {
		this.obj = obj;
	}

	public void print() {
		System.out.println(obj);
	}
}

public class TestGenricClass {

	public static void main(String[] args) {
		Test<String> obj1 = new Test<>("Infinity");
		obj1.print();

		Test<Integer> obj2 = new Test<>(10);
		obj2.print();
	}

}
