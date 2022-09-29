package test2;

/*Object class is the superclass of all the classes.
Implicitly gets imported*/

class A extends Object {
	protected int a = 10;
	
}

class B extends A {
	private int b = 10;

	public void add() {
		int sum = a + b;// a is accessible because it is in parent class
		System.out.println("Result = " + sum);
	}
}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		obj.add();
	}
}
