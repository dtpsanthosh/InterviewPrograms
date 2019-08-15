package Java1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		/*
		 * list.add(10); list.add(10); list.add(11); list.add(11);
		 */
		System.out.println("ArrayList with duplicates: " + list);
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println("ArrayList with duplicates removed: " + newList);
		List<String> l = new ArrayList<>(Arrays.asList("gsk", "gsk", "kumar"));
		List<String> ls = l.stream().distinct().collect(Collectors.toList());
		System.out.println(ls);
	}
}