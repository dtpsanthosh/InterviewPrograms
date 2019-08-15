package Interview1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListExmple {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("gsk");
		al.add("kumar");
		al.add("santhosh");
		al.add("gsk");
		System.out.println(al);
		System.out.println("-----by using for loop------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-----By using for each loop------");
		for(String i:al) {
			System.out.println(i);
		}
		int i=0;
		System.out.println("------By using while loop------");
		while(i<al.size()){
			System.out.println(al.get(i));
			i++;
		}
		System.out.println("------By using do while loop------");
		int j=0;
		do{
			System.out.println(al.get(j));
			j++;
		}while(j<al.size());
		System.out.println("------By using Iterator------");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println("------By using ListIterator------");
		ListIterator<String> lit=al.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next());
		}
	}
