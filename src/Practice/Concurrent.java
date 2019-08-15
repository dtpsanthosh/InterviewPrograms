package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrent {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
			if(next.equals(30))
				al.add(50);
		}
	}

}
