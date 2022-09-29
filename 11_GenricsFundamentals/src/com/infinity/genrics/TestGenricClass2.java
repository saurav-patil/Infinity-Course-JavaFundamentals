package com.infinity.genrics;

class Test2<T1, T2> {
	T1 key;
	T2 value;

	public void put(T1 key, T2 value) {
		System.out.println("Key - " + key);
		System.out.println("Value - " + value);
	}
}

public class TestGenricClass2 {

	public static void main(String[] args) {
		Test2<String, Integer> t2 = new Test2<>();
		t2.put("Sachin", 101);
		t2.put("Kohli", 102);
	}

}

//Create similar class like a Arraylist -
//Create similar class like a HashMap -