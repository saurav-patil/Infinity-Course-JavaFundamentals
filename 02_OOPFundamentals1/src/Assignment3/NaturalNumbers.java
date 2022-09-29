package Assignment3;

//1.Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 4 or 7.
public class NaturalNumbers 
{
	public static void main(String[] args) 
	{
		NaturalNumbers na = new NaturalNumbers();
		int result = na.computeSum(7);
		System.out.println("The sum of natural numbers which are divisible by 4 or 7 is -> " + result);
	}

	// Method Compute or calculate Sum
	public int computeSum(int number) 
	{
		int sum = 0;
		for (int i = 1; i <= number; i++) 
		{
			if (i % 4 == 0 || i % 7 == 0) 
			{
				sum = sum + i;
			}
		}
		return sum;
	}
}