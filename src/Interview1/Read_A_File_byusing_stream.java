package Interview1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Read_A_File_byusing_stream {

	public static void main(String[] args) throws IOException {
		System.out.println("Doing more things than just reading file using Java 8 Streams");
		Files.lines(new File("manifest.mf").toPath()).map(s -> s.trim()).filter(s -> !s.isEmpty())
				.forEach(System.out::println);

	}

}
