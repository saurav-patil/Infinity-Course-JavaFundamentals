package Assignment2;
import java.util.*;
public class GrossSalary 
{
	public static void main(String[] args) 
	{
		int bsal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic salary - ");
		bsal = sc.nextInt();
		sc.close();
		GrossSalary gs = new GrossSalary();
		gs.salFunc(bsal);
	}

	public void salFunc(int bsal) 
	{
		long da, hra, gross;
		if (bsal <= 15000) 
		{
			hra = 20 * bsal / 100;
			da = 70 * bsal / 100;
			gross = bsal + hra + da;
			System.out.println("The GrossSalary for basic salary Rs." + bsal + " is Rs." + gross + "\n"
					+ "Considering 20% as HRA and 70% as DA");
		} else if (bsal > 15000 && bsal <= 30000) 
		{
			hra = 35 * bsal / 100;
			da = 80 * bsal / 100;
			gross = bsal + hra + da;
			System.out.println("The GrossSalary for basic salary Rs." + bsal + " is Rs." + gross + "\n"
					+ "Considering 35% as HRA and 80% as DA");
		} 
		else 
		{
			hra = 20 * bsal / 100;
			da = 80 * bsal / 100;
			gross = bsal + hra + da;
			System.out.println("The GrossSalary for basic salary Rs." + bsal + " is Rs." + gross + "\n"
					+ "Considering 20% as HRA and 80% as DA");
		}

	}
}