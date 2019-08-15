package Java1_8;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);  
		long count = myList.stream().count();
		System.out.println("Total elements in the list " + count);

		long count1 = myList.stream().filter(i -> i > 10).count();
		System.out.println("Total elements in the list with value greater than 10: " + count1);
	}

}
