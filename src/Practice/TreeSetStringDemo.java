package Practice;
import java.util.Comparator;
import java.util.TreeSet;
class TreeSetStringDemo {
	public static void main(String args[]) {
		TreeSet<String> t = new TreeSet<>(new MyComparator());
		t.add("Raja");
		t.add("Shamanth");
		t.add("Ganga");
		t.add("Ramu");
		System.out.print(t);
	}
}
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1); // Here reversing the objects
	}
}