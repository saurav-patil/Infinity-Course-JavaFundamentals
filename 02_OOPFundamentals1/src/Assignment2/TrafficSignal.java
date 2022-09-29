package Assignment2;
import java.util.Scanner;

public class TrafficSignal {
	public static void main(String... args) {
		System.out.println("1.*RED*\n2.*YELLOW*\n3.*GREEN*");
		System.out.println("\nChoose any one of the above:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		TrafficSignal ts = new TrafficSignal();
		ts.trafficFunc(num);
	}

	public void trafficFunc(int num) {
		if (num == 1) {
			System.out.println("# STOP! #");
		}
		if (num == 2) {
			System.out.println("# READY! #");
		}
		if (num == 3) {
			System.out.println("# GO! #");
		}
	}
}
