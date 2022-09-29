package Assignment2;
public class SumOfCubes 
{
	public static void main(String[] args) 
	{
		SumOfCubes sn = new SumOfCubes();
		sn.sumFunc(1234);
	}

	public void sumFunc(int num) 
	{
		int sum = 0;
		while (num > 0) 
		{
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		System.out.println("The sum of cubes of all the digits entered is " + sum);
	}

}
