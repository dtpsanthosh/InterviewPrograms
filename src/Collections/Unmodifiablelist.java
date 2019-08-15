package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiablelist {
	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("santhosh");
		List<String> list=Collections.unmodifiableList(al);
		//ImmutableList<String> iList = ImmutableList.copyOf(list); 
		al.add("kumar");
		System.out.println(list);
	}
}
