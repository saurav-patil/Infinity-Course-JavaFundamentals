package stream01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		String comp[] = { "Infosys", "TCS", "Capgemini", "J.P Morgan", "HDFC", "ITC", "INFINITY" };

		List<String> list = Arrays.asList(comp);

		// list.stream().filter(e -> e.startsWith("I")).forEach(e ->
		// System.out.println(e));

		Set<String> set = list.stream().filter(e -> e.startsWith("I")).collect(Collectors.toSet());

		List<String> list2 = list.stream().filter(e -> e.startsWith("I")).collect(Collectors.toList());
		long count = list.stream().filter(e -> e.startsWith("I")).count();

		System.out.println(set);
		System.out.println(list2);
		System.out.println("Count : " + count);
	}

}
