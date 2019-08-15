package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		if(names.stream().anyMatch((String name) -> name.length() == 5))
		{
		    System.out.println("Yes... There is a name exist with 5 letters");
		}
		if(names.stream().allMatch((String name) -> name.length() > 5))
		{
		    System.out.println("All are big names");
		}
		if(names.stream().noneMatch((String name) -> name.length() == 2))
		{
		    System.out.println("There is no two letter name");
		}
	}

}
