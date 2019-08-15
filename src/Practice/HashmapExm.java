package Practice;

import java.util.HashMap;

public class HashmapExm {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1,0);
		hm.put(1, 1);
		hm.put(null, 1);
		hm.put(1, null);
		hm.put(null, -1);
		System.out.println(hm);
	}
}
/*hm.put(1,null);
hm.put(null,0);
hm.put(null,null);
hm.put(1,Integer.parseInt("1"));
hm.put(null,-1);*/