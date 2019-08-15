package Interview1;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(13);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
			al.add(11); //in this every time we can create one clone object thats y v can allow the modifications
			System.out.println(al);
		}
		Map<Integer,String> a=new ConcurrentHashMap<>();
		a.put(10,"gsk");
		a.put(20, "hai");
		Iterator<Integer> itr=a.keySet().iterator();
		while(itr.hasNext()) {
			Integer in=itr.next();
			System.out.println(in);
			a.put(30, "hai44");
		}
		
	}

}
