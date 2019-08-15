package Interview1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UnionList {
	public static void main(String[] args) {
		List<String> col1 = new ArrayList<String>();
		// Collection<String> col1 = new TreeSet<String>();
		col1.add("a");
		col1.add("b");
		col1.add("c");
		col1.add("g");
		List<String> col2 = new ArrayList<String>();
		// Collection<String> col2 = new TreeSet<String>();
		col2.add("b");
		col2.add("c");
		col2.add("d");
		col2.add("e");
		col1.addAll(col2); //union[a, b, c, g, b, c, d, e]
	//	col1.retainAll(col2);//intersection[b, c]
	//	col1.removeAll(col2);//[a, g]
		System.out.println(col1);
	}
}
