package Assignment4;

//Q.Program to get desired pattern output.

public class Pattern {

	public static void main(String[] args) {
//		 pattern1(4);
//		 pattern2(4);
//		 pattern3(4);
//		 pattern4(4);
//		 pattern5(4);
// 		 pattern6(4);
//		 pattern7(4);
//		 pattern8(4);
//		 pattern9(4);
		pattern10(4);

	}

	// pattern1
	public static void pattern1(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

	}

	// pattern2
	public static void pattern2(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	// pattern3
	public static void pattern3(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	// pattern4
	public static void pattern4(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	// pattern5
	public static void pattern5(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	// pattern6
	public static void pattern6(int num) {
		for (int row = 1; row <= num; row++) {
			int noOfSpaces = num - row;
			{
				for (int s = 1; s <= noOfSpaces; s++) {
					System.out.print("  ");
				}
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	// pattern7
	public static void pattern7(int num) {
		for (int row = 1; row <= num; row++) {
			int noOfSpaces = num - row;
			{
				for (int s = 1; s <= noOfSpaces; s++) {
					System.out.print("  ");
				}
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
			}
			for (int col = row - 1; col >= 1; col--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	// pattern8
	public static void pattern8(int num) {
		for (int row = 1; row <= num; row++) {
			int noOfSpaces = num - row;
			{
				for (int s = 1; s <= noOfSpaces; s++) {
					System.out.print("  ");
				}
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	// pattern9
	public static void pattern9(int num) {
		for (int row = 1; row <= num; row++) {
			int noOfSpaces = num - row;
			{
				for (int s = 1; s <= noOfSpaces; s++) {
					System.out.print("  ");
				}
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	// pattern10
	public static void pattern10(int num) {
		for (int row = 1; row <= num; row++) {
			int noOfSpaces = num - row;
			{
				for (int s = 1; s <= noOfSpaces; s++) {
					System.out.print("  ");
				}
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			for (int col = row - 1; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
