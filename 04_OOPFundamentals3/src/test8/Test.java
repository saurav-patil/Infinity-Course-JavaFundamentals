package test8;
//Polymorphism

class A {
	public void show() {
		System.out.println("Show method of A");
	}
}

class B extends A {
	public void show() {
		System.out.println("Show method of B");
	}
}

public class Test {

	public static void main(String[] args) {
		A ref = null;

		A obj1 = new A();// Object of class A with ref obj1
		B obj2 = new B();// Object of class B with ref obj2

		// class math has method random it will generate the number 0 to 1
		// random is static method as it is called using a class name.
		// as object creation happens at runtime hence polymorphism happens at runtime.
		
		if (Math.random() > 0.5) {
			ref = obj1;
		} else {
			ref = obj2;
		}
		ref.show();
	}

}
