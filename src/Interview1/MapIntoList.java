package Interview1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapIntoList {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 34);
		map.put("D", 90);
		map.put("B", 12);
		map.put("C", 91);
		List<Map<String, Integer>> listMap = new ArrayList<>();
		listMap.add(map);
		listMap.forEach(System.out::println);
	}
}
