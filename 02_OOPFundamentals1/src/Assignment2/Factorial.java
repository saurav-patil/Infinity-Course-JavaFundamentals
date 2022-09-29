package Assignment2;
public class Factorial {
	public static void main(String[] args) {
		Factorial fl = new Factorial();
		fl.factFunc(5);
	}

	public void factFunc(int num) {
		long result = 1l;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}