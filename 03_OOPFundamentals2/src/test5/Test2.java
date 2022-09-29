package test5;

public class Test2{
	int a;
	static int b; //class var

	static//initialize static member of class
	{
		b=1;
		System.out.println("Static block");
	}
		
	Test2()
	{
		this(28);//this is calling constructor of same class.
		System.out.println("Default Constructor");
	}
	
	Test2(int a)
	{
		this.a=a;
		System.out.println("Parameterized constructor " +a);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Test2 t2 = new Test2();
	}
}
