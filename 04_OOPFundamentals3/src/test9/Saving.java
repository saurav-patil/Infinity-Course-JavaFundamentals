package test9;

public class Saving extends Account {
	private double roi;

	public Saving(int number, String holder, double balance, double roi) {
		super(number, holder, balance);
		this.roi = roi;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("ROI = " + roi);
	}
}
