package StreamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CreateStreamOfEx {

	public static void main(String[] args) throws IOException {
		System.out.println("Doing more things than just reading file using Java 8 Streams");
		Files.lines(new File("manifest.mf").toPath()).map(s -> s.trim()).filter(s -> !s.isEmpty())
				.forEach(System.out::println);

		/*
		 * // create Stream using Stream.of(comma seperated values) Stream<Integer>
		 * intStream = Stream.of(1,2,3,4,5); intStream.forEach(System.out::println);
		 * 
		 * System.out.println("--------------"); // create stream using array of
		 * elements Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
		 * intStream1.forEach(System.out::println);
		 */ }
}