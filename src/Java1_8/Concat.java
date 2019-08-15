package Java1_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("1", "2", "3", "4", "5");
		String[] arr1 = { "a", "b", "c", "d" };
		// concatenating two streams
		Stream<String> stream = Stream.concat(myList.stream(), Arrays.stream(arr1));
		stream.forEach(System.out::print);
	}

}
