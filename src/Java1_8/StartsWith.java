package Java1_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StartsWith {

	public static void main(String[] args) {
		List<String> nameList1 = Arrays.asList("Ram", "Amit", "Ashok", "Manish", "Rajat");
		List<String> nameList2 = Arrays.asList("Anthony", "Samir", "Akash", "Uttam");
		Stream<String> stream = Stream.concat(nameList1.stream().filter(n -> n.startsWith("A")),
				                              nameList2.stream().filter(n -> n.startsWith("A")));
		stream.forEach(System.out::println);
	}
}
