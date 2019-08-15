package StreamAPI;
import java.util.Arrays;
import java.util.List;
public class CountEmptySet {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bkjhc", "efg", "abcd", "", "jkl");
		// get count of empty string
		//int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		count = strings.stream().filter(string -> string.length() == 3).count();
		System.out.println("Strings of length 3: " + count);
		
	}
}
