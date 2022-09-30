package stream01;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String comp[] = { "Infosys", "TCS", "Capgemini", "J.P Morgan", "HDFC", "ITC", "INFINITY" };

		List<String> list = Arrays.asList(comp);
		// FOR EACH METHOD
		list.forEach(e -> System.out.println(e));

		
		
	}

}
