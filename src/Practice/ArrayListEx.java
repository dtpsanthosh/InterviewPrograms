package Practice;
import java.util.ArrayList;
import java.util.List;
public class ArrayListEx {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.add("D");
		List<String> mySubList = myList.subList(2, 4);
		System.out.println("List content is " + myList);
		myList.removeAll(mySubList);
		System.out.println("List content  after remove is" + myList);

	}

}