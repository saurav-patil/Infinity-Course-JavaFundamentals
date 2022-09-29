package test6;

class Person{
	String firstName,lastName;
	
	Person(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class Test {
	static void display(int value) 
	//Value is local to this block only
	{
		value = 100;
	}
	
	static void display(Person ref)
	{
		ref.firstName = "Test";
		ref.lastName = "Test";
	}
	
	public static void main(String[] args) {
		int value = 200;
		Test.display(value);//Calling display method by passing int value as parameter..
		System.out.println("value = "+ value);
	
		System.out.println("-------------------------------------------------");
	
		Person saurav = new Person("Saurav" , "Patil");
		Test.display(saurav);//Calling display method by passing reference as parameter..
		System.out.println(saurav.firstName +","+saurav.lastName);
	}

}
