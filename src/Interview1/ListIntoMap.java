package Interview1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListIntoMap {
	public static void main(String args[]) {
		List<String> l1Key = new ArrayList<>();
		l1Key.add("Basant");
		l1Key.add("Babul");
		List<String> l2Key = new ArrayList<>();
		l2Key.add("Manoj");
		l2Key.add("Amit");
		l2Key.add("Saroj");
		List<Double> l1Value = new ArrayList<>();
		l1Value.add(50.000);
		l1Value.add(40.000);
		List<Double> l2Value = new ArrayList<>();
		l2Value.add(90.000);
		l2Value.add(60.000);
		l2Value.add(30.000);
		Map<List<String>, List<Double>> dataMap = new HashMap<>();
		dataMap.put(l1Key, l1Value);
		dataMap.put(l2Key, l2Value);
		dataMap.forEach((key, value) -> System.out.println(key + " = " + value));
	}
}