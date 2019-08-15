package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		names.add("David");
		//Selecting names containing more than 5 characters
		names.stream().filter(name -> name.length() > 5).forEach(System.out::println);
		System.out.println("_______________remove duplicates________________");
		names.stream().distinct().forEach(System.out::println);
		System.out.println("_______________Limit Values________________");
		names.stream().limit(4).forEach(System.out::println);
		System.out.println("_______________Skip Values________________");
		names.stream().skip(4).forEach(System.out::println);
	}
}
