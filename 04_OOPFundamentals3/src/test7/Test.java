package test7;

//Method over-ridding//Polymorphism
//For any class there is a common super class i.e object class by default which is present in java.lang package

class A {
	public void show() {
		System.out.println("Show method of A");
	}

	protected void show2() {

	}

	void show3() {

	}

//	private void show4() {
//
//	}

}

class B extends A {
	@Override
	public void show() {
		System.out.println("Show method of B");
	}

	@Override
	public void show2() {

	}

	@Override
	protected void show3() {

	}

	// Not over-ridding.
//	@Override
//	private void show4() {
//
//	}
}

public class Test {

	public static void main(String[] args) {
		A ref = null;
		ref = new A();
		ref.show(); // will call method of class A
		ref = new B();
		ref.show(); // invoke method of B because we storing object of B

	}
}
