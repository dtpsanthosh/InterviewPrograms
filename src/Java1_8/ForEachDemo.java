package Java1_8;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachDemo {
	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();    
	list.add(1);
	list.add(2);
	list.add(3);
	list.forEach(System.out::println);
	list.forEach(i->System.out.println(i));
}
}

