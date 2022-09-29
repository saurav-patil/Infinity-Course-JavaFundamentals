package test4;

//i.e Class A extends Object and there is nothing written in Object constructor.
class A {
	A(){		
		System.out.println("A()");
	}
	A(int a) {
	
	}
}

class B extends A {
	B() {
		System.out.println("B()");
	}
}

public class Test {

	public static void main(String[] args) {
		//A obj1 = new A();
		B obj2= new B();
	}

}
