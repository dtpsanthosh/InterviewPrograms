package Onlinetest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(10, "hai");
		m.put(20,"bye");
		Set s=m.keySet();
		System.out.println(s);
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
		}
		Iterator<String> value=m.values().iterator();
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		for(Map.Entry<Integer, String> e:m.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		m.forEach((k,v)->System.out.println(k+":"+v));
	}
}