package Assignment2;
public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		FibonacciSeries fs = new FibonacciSeries();
		fs.fiboFunc(6);
	}

	public void fiboFunc(int num) 
	{
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 1; i < num; i++) 
		{
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println("The " + num + "th number of the Fibonacci Series is " + sum);
	}
}
