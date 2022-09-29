package Assignment3;

//4.Create a method to check if a number is a power of two or not.
public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		int number = 8;
		PowerOfTwo po = new PowerOfTwo();
		boolean result = po.checkNumber(number);
		if (result == true) 
		{
			System.out.println(number + " is a power of 2");
		} else {
			System.out.println(number + " is not a power of 2");
		}
	}

	public Boolean checkNumber(int number) 
	{
		boolean flag = false;
		if (number % 2 == 0) 
		{
			flag = true;
		}
		return flag;
	}
}
