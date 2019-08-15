package Java1_8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ListDecendingOrder {
	public static void main(String[] args) {
		List<Integer> testList = new ArrayList();
		testList.add(5);
		testList.add(7);
		testList.add(1);
		testList.add(2);
		testList.add(1);
		testList.add(71);
		testList.add(92);
		testList.add(12);
		testList.add(6);
		testList.add(3);
		testList.add(6);
		List<Integer> l=testList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		//System.out.println(l);
		l.forEach(System.out::println);
		List<Integer> d=testList.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(d);// removing duplicates
		d.forEach(System.out::println);
		Stream<Integer> s=testList.stream().distinct();
		s.forEach(System.out::println);
	}

}
