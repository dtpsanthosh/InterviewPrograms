package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Count_Duplicated_Elements_inList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("santhosh");
		al.add("kumar");
		al.add("santhosh");
		al.add("santhosh");
		System.out.println("\nExample 1 - Count 'santhosh"+"' with frequency");
		System.out.println("santhosh:" + Collections.frequency(al, "santhosh"));
		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> s = new HashSet<>(al);
		for (String temp : s) {
			System.out.println(temp + ":" + Collections.frequency(al, temp));
		}
		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : al) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);
	}
	private static void printMap(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
