package test;

public class StringDemo2 {

	public static void main(String[] args) {

		String str1 = "hello"; // String object will get created in string constant pool
		String str2 = new String("hEllo");
		String str3 = "hello";
		// all three are objects only in case of string it is possible

		if (str1 == str2) {
			System.out.println("str1==str2");
		} else {
			System.out.println("str1!=str2");
		}
		// == checks whether reference are pointing to same object or not.

		if (str1 == str3) {
			System.out.println("str1==str3");
		} else {
			System.out.println("str1!=str3");
		}

		System.out.println("-------------------------------------");

		if (str1.equals(str2)) {
			System.out.println("str1 is equal to str2");
		} else {
			System.out.println("str1 is not equal to str2");
		}

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("str1 is equal to str2");
		} else {
			System.out.println("str1 is not equal to str2");
		}
		// equalsIgnoreCase is used to ignore the upper case and lower case.

		if (str1.equals(str3)) {
			System.out.println("str1 is equal to str3");
		} else {
			System.out.println("str1 is not equal to str3");
		}

	}

}
