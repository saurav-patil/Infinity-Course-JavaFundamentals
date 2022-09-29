package test3;

public class Animal {
	public String category;
	private String size;
	protected String colour;

	private void eat() {
		System.out.println("Animal Eat food");
	}

	public static void main(String[] args) {
		Animal dg = new Dog();
		dg.eat();
	}
}

class Dog extends Animal {

}