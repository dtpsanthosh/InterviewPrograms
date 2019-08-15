package StreamAPI;

import java.util.stream.Stream;

public class EmptyStream {

	public static void main(String[] args) {
		Stream<Student> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());
	
		Stream<Student> singleElementStream = Stream.of(new Student());
		System.out.println(singleElementStream.count());
		
		Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);
		System.out.println("Count:"+streamOfNumbers.count());
		
		Stream<String> s=Stream.of("gsk","kumar","kumar");
		System.out.println(s.count());
	}

}
