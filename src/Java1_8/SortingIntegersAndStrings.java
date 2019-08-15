package Java1_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class SortingIntegersAndStrings {
	String name;
	int eno;
	SortingIntegersAndStrings(String name, int eno) {
		this.name=name;
		this.eno=eno;
	}
@Override
public String toString() {
	return eno+":"+name;
}
	public static void main(String[] args) {
		ArrayList<SortingIntegersAndStrings> al=new ArrayList<>();
		al.add(new SortingIntegersAndStrings("santhosh", 1254));
		al.add(new SortingIntegersAndStrings("kumar", 32547));
		al.add(new SortingIntegersAndStrings("gsk", 1475));
		System.out.println(al);
		Collections.sort(al, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0); // Integer Sorting
		System.out.println(al);
		Collections.sort(al, (e1,e2)->e1.name.compareTo(e2.name)); //String sorting
		System.out.println(al);
	}

}
