package stream01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		String comp[] = { "Infosys", "TCS", "Capgemini", "J.P Morgan", "HDFC", "ITC", "INFINITY" };
		List<String> list = Arrays.asList(comp);

		// Function<String, Integer> function = (String element) -> {return
		// element.length();};

		Function<String, Integer> function = element -> element.length();
		Predicate<Integer> predicate = element -> element % 2 == 0;
		Consumer<Integer> consumer = element -> System.out.println(element);

		// map is intermediate operation
		list.stream()
		.map(function)
			.filter(predicate)
				.forEach(consumer);
	}

}
