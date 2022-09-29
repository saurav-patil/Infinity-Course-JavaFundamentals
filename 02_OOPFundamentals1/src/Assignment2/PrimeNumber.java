package Assignment2;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num = 2;
		PrimeNumber pn = new PrimeNumber();
		pn.primeFunc(num);
	}

	public void primeFunc(int num) 
	{
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) 
			{
				if (num % i == 0)
					count++;
			}
			if (count == 2) 
			{
				System.out.println("Number is prime");
			} else 
			{
				System.out.println("Number is not prime");
			}
		} else 
		{
			System.out.println("Enter number greater than 1");
		}

	}
}