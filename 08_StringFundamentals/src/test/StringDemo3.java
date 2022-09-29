package test;

public class StringDemo3 {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = str1;

		if (str1 == str2) {
			System.out.println("str1 == str2");
		}

		if (str1.equals(str2)) {
			System.out.println("str1 is equals to str2");
		}

		if (str1 == str3) {
			System.out.println("str1==str3");
		}
	}

}
