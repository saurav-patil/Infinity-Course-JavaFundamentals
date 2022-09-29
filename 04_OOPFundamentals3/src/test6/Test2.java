package test6;

class Shape {
	public void area(int radius) {
		System.out.println("Area of the circle = " + (3.14 * radius * radius));
	}

	public void area(int l, int b) {
		System.out.println("Area of the rectangle = " + (l * b));
	}
}

//Method Overloading can be done only within one class.
//Binding - Connecting a method call to method body.(Happens at compile time)
public class Test2 {
	public static void main(String[] args) {
		Shape obj = new Shape();
		obj.area(10,7);
		obj.area(5);
	}

}
