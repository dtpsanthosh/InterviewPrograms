package Interview1;
import java.util.ArrayList;
import java.util.Iterator;
public class FailFast {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
	//  CopyOnWriteArrayList<String> al=new CopyOnWriteArrayList<>(); //by using this we can avoid concurrentmodificationexception 
		al.add("Hai");
		al.add("bye");
		al.add("gsk");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add("santhosh"); // every time the next() we can check the list size thats why we can occur concurrent modification exception
		}                           //initial size equals to current size 
	}

}
