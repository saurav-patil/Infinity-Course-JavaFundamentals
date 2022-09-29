package Assignment2;
public class FloydFormat {
	public static void main(String[] args) {
		FloydFormat ff = new FloydFormat();
		ff.patternFunc(5);
	}

	public void patternFunc(int num) {
		for (int row = 0; row < num; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println("\n");
	
		}
	}
}
