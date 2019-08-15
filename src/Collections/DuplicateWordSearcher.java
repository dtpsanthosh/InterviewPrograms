package Collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class DuplicateWordSearcher {
	public static void main(String[] args) {
		String str = "santhosh gsk kumar santhosh a b c";
		List<String> list = Arrays.asList(str.split(" "));
		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
			System.out.println("hai");
		}
	}
}