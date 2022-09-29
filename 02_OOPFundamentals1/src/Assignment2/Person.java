package Assignment2;

public class Person {
	String firstName;
	String lastName;
	int age;

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		
		person1.firstName = "Virat";
		person1.lastName = "Kohli";
		person1.age = 22;
		

		person2.firstName = "Rohit";
		person2.lastName = "Sharma";
		person2.age = 21;

		System.out.println("FirstName -> " + person1.firstName);
		System.out.println("LastName -> " + person1.lastName);
		System.out.println("Age -> " + person1.age);

		System.out.println("---------------------------------");

		System.out.println("FirstName -> " + person2.firstName);
		System.out.println("LastName -> " + person2.lastName);
		System.out.println("Age -> " + person2.age);

	}
}
