package Interview1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapIteration {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String, Integer>();
		m.put("a",456);
		m.put("b",123);
		m.put("c", 789);
		m.put("a", 123);
		Set<Map.Entry<String, Integer>> s=m.entrySet();
		Iterator<Map.Entry<String, Integer>> itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> i=itr.next();
			System.out.println(i.getKey()+":"+i.getValue());
		}
	}
}
