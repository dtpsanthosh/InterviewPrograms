package Interview1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapDemo {
	public static void main(String[] args) {
		/*HashMap<String, Integer>hm=new HashMap<String,Integer>();
		hm.put("mnop", 40);
		hm.put(null, null);
		hm.put("pqrs", null);
		hm.put("qwer", 60);
		hm.put("stuv", 50);
		hm.put("ghij", 30);
		hm.put("hsk", 12);
		System.out.println(hm.keySet()); // keyset
		Collection<Integer> c=hm.values();
		System.out.println("values:"+c); //values:[null, 40, 12, 30, 50, null, 60]
		System.out.println(hm.containsKey("abcd"));//false
		System.out.println(hm.containsValue(50));//true
		System.out.println(hm);//{null=null, mnop=40, hsk=12, ghij=30, stuv=50, pqrs=null, qwer=60}
*/	
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(40,"mnop");
		hm.put(null, null);
		hm.put(null,"pqrs");
		hm.put(60,"qwer");
		hm.put(50,"stuv");
		hm.put(30,"ghij");
		hm.put(12,"hsk");
		hm.forEach((key,value) -> System.out.println(key+":"+value));
		System.out.println(hm);
		System.out.println("keyset:"+hm.keySet());
		Collection<String> i=hm.values();
		System.out.println("value set:"+i);
		System.out.println(hm.get(60));
		System.out.println(hm.containsValue("hsk"));
		System.out.println(hm.values());
		Set<Integer> s=hm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println("Keys:"+itr.next());
		}
		Collection<String> str=hm.values();
		Iterator it=str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*for(String It1:str) {
			System.out.println(It1);
		}*/
	}
	

}
