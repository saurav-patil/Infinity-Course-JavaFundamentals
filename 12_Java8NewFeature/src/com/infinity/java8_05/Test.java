package com.infinity.java8_05;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {

//		Consumer<String> consumer = ( str) -> System.out
//				.println("String is - " + str + " and length is " + str.length());

		// Better way to write
		Consumer<String> consumer = str -> System.out.println("String is - " + str + " and length is " + str.length());

//		Supplier<String> supplier = () -> {
//			return "Infinity Uran";
//		};

		// Better way to write
		Supplier<String> supplier = () -> "Infinity Uran";

		Predicate<String> predicate = str -> str.startsWith("I");

		consumer.accept("Infinity");
		System.out.println(supplier.get());
		System.out.println(predicate.test("Inifnity Uran"));
	}

}
