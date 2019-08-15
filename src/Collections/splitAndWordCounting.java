package Collections;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class splitAndWordCounting {
	public static void main(String[] args) {
		String str = "Gsk Gsk Gsk Gsk santhosh kumar Hai ";
		Map<String, Long> map11 = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map11);
		// output => {Hai=1, santhosh=1, kumar=1, Gsk=4}
	}

}
