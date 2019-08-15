package Collections;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EachCharacterCount {
	public static void main(String[] args) {
		String str = "santhosh kumar";
		String[] stringarray = str.split("");
		Map<String, Long> map = Arrays.stream(stringarray)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}
}