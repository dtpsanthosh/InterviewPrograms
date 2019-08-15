package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class NaturalSortingOrder {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		//Sorting the names according to natural order
		names.stream().sorted().forEach(System.out::println);
		names.stream().sorted((i1,i2)->-i1.compareTo(i2)).forEach(System.out::println);
		
	}

}
