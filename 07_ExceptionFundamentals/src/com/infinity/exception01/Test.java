package com.infinity.exception01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int number1, number2;
		double number3;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter value of number1: ");
			number1 = sc.nextInt();

			System.out.println("Enter value of number2:");
			number2 = sc.nextInt();

			number3 = number1 / number2;
			System.out.println("Division = " + number3);
		} catch (ArithmeticException e) {
			System.out.println("Please do not divide number by zero");
		}
		System.out.println("End of program.......");
		sc.close();
	}
}
