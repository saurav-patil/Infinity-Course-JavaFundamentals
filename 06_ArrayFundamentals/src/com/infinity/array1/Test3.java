package com.infinity.array1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements of array:");

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}

		for (int sau : arr) {
			System.out.print(sau + " ");
		}
	}

}
