package Java1_8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ListAscendingOrder {
	public static void main(String[] args) {
		List<Integer> testList = new ArrayList();
		testList.add(5);
		testList.add(71);
		testList.add(92);
		testList.add(12);
		testList.add(6);
		testList.add(3);
		testList.add(6);
		List<Integer> l=testList.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		testList.stream().sorted().forEach(System.out::println);
	}

}
