package stream01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		String comp[] = { "Infosys", "TCS", "Capgemini", "J.P Morgan", "HDFC", "ITC", "INFINITY" };

		List<String> list = Arrays.asList(comp);

		// list.forEach(e -> System.out.println(e));

		// list.stream will give a stream object
		// inside stream i am having a method foreach
		Stream<String> stream = list.stream();
		// using method inside a stream interface

		// *******
		// stream.forEach(e -> System.out.println(e)); // terminal operation

		// once a stream is terminated thhen we cannot perfrom any other operation on
		// that stream
		// stream.forEach(e -> System.out.println(e)); // cannot call any operation on
		// the terminated stream

		stream = list.stream(); // again gives a stream object
		Predicate<String> predicate = (String element) -> element.length() > 3;
		stream.filter(predicate)
			.forEach(e -> System.out.println(e));

	}

}
