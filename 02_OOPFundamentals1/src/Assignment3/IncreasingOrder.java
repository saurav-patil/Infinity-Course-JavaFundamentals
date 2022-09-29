package Assignment3;

//3.Create a method to check if a number is an increasing number.
public class IncreasingOrder 
{
	public static void main(String[] args) 
	{
		int number = 134468;
		if (checkNumber(number) == true) 
		{
			System.out.println(number + " is an increasing number");
		} else {
			System.out.println(number + " is not an increasing number");
		}
	}

	public static boolean checkNumber(int number) 
	{
		int Rnum;
		boolean flag = false;
		Rnum = number % 10;
		number = number / 10;
		while (number > 0) 
		{
			if (Rnum >= number % 10) 
			{
				flag = true;
				//break;
			}
			Rnum = number % 10;
			number = number / 10;
		}
		return flag;
	}
}
