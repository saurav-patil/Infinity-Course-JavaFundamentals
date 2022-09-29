package Assignment2;
public class SumOfNumbers {
	public static void main(String[] args) {
		SumOfNumbers sn = new SumOfNumbers();
		sn.sumFunc(4521);
	}

	public void sumFunc(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("The sum of all the digits entered is " + sum);
	}

}
