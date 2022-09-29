package com.infinity.array1;

public class Test2 {

	public static void main(String[] args) {
		int arr[] = { 101, 102, 204, 304, 12, 15 };

		for (int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

			System.out.println("\n----------------------");
			
		for (int x : arr) {
			System.out.println(x);
		}
		
	}

}
