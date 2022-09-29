package test5;

public class Test {
	int a,b;  //Instance variable
	static int c; //Class variable
	
	//Can access static as well as non static members
	void meth1()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
	
	//Can't access non static data member(variables)
	static void meth2() 
	{
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
	public static void main(String[] args) {
		int d=0; //local variable
		//System.out.println("a = "+a);
		//System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	
		
		//Ways for calling a static method 
		meth2();
		Test.meth2();
	}

}
