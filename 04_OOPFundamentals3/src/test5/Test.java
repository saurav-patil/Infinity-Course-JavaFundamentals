package test5;

//i.e Class A extends Object and there is nothing written in Object constructor.
class A {
	A() {
		System.out.println("A()");
	}

	A(int a) {
		System.out.println("A(int a)");
	}
}

//Use super keyword to invoke the constructor of another class
class B extends A {
	B() {
		super(101);
		System.out.println("B()");
	}

	B(int a) {
		System.out.println("B(int b)");
	}
}

//First default constructor is called 
public class Test {

	public static void main(String[] args) {
		B obj1 = new B();
		B obj2 = new B(1000);
	}

}
