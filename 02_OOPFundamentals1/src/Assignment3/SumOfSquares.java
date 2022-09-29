package Assignment3;

//2.Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
public class SumOfSquares 
{
	public static void main(String[] args) 
	{
		SumOfSquares sq = new SumOfSquares();
		int result = sq.computeDifference(4);
		System.out.println("The difference between sum of squares and square of sum is -> " + result);
	}
	
	//Method Compute or calculate the difference
	public int computeDifference(int number) 
	{
		int sumofsquare = 0;
		int squareofsum = 0;
		int s = 0;
		for (int i = 1; i <= number; i++) 
		{
			sumofsquare += i * i;
			s += i;
			squareofsum = s * s;
		}
		int difference = sumofsquare - squareofsum;
		return difference;
	}
}
