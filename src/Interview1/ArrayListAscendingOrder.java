package Interview1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayListAscendingOrder {
	public static void main(String[] args) {
	/*	List<Integer> testList = new ArrayList();
		testList.add(5);
		testList.add(7);
		testList.add(1);
		testList.add(92);
		testList.add(12);
		testList.add(6);
		testList.add(3);
		testList.add(6);
		Collections.sort(testList);
		System.out.println(testList);
		Collections.sort(testList, Collections.reverseOrder());
		System.out.println(testList);*/
		List<String> list=new ArrayList();
		list.add("b");
		list.add("a");
		list.add("c");
		Collections.sort(list); // Ascending Order
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder()); // descending order
		System.out.println(list);
	}

}
