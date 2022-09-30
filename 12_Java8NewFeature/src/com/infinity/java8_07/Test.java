package com.infinity.java8_07;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {

		String com[] = { "Infosys", "J.P Morgan", "HDFC", "CapGemini", "LNT", "Infinity" };

		// asList - takes array as a parameter and converts array to list
		List<String> list = Arrays.asList(com);

		System.out.println("Way 1 - to display list ");
		System.out.println(list);

		System.out.println("----------------------------------------------------------");

		System.out.println("Way 2  - to display list : Using For Each Loop");
		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("----------------------------------------------------------");

		System.out.println("Way 3 - to display list : Using Iterator");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("----------------------------------------------------------");

		System.out.println("Way 4 - to display list : Using ListIterator");
		ListIterator<String> itr1 = list.listIterator();
		System.out.println("Forward Direction - ");
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}
		System.out.println();

		System.out.println("Backward Direction - ");
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		System.out.println("----------------------------------------------------------");

		System.out.println("Way 5 - to display list : Using Traditional ForLoop");
		for (int i = 0; i < com.length; i++) {
			System.out.println(com[i]);
		}

		System.out.println("----------------------------------------------------------");

		Consumer<String> consumer = (String str) -> System.out.println(str + ":" + str.length());
		list.forEach((String str) -> System.out.println(str + ":" + str.length()));

		// Efficient Way
		System.out.println("----------------------------------------------------------");
		list.forEach(str -> System.out.println(str + ":" + str.length()));

		// Stream API (String starting with letter "I")
		System.out.println("----------------------------------------------------------");
		list.stream().filter((String e) -> e.startsWith("I")).forEach(e -> System.out.println(e));

	}

}
