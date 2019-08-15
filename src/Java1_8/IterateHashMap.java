package Java1_8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateHashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "gsk");
		map.put(102, "santhosh");
		map.forEach((key, value) -> System.out.println(key + " = " + value));
		/*
		 * for (Map.Entry<Integer,String> entry : map.entrySet())
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue());
		 */
		Map<Integer, String> m = map.entrySet().stream().filter(n -> n.getKey() == 102)
				.collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue()));
		System.out.println("Get a Particular Key Set:" + m);
		Map<Integer, String> m1 = map.entrySet().stream().filter(n -> n.getValue() == "gsk")
				.collect(Collectors.toMap(k -> k.getKey(), k -> k.getValue()));
		System.out.println("Get a Particular Value Set:" + m1);
	}
}