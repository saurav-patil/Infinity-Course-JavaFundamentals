package test3;
public class SumOfCubes {
	public static void main(String[] args) {
		int result  = SumOfCubes.sumFunc(9);
		System.out.println(result);
	}
	public static int sumFunc(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;	
		}
		return sum;
	}
}

