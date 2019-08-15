package Interview1;

import java.util.ArrayList;

public class ArrayListCts {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		System.out.println(al.get(1));
		System.out.println(al.get(2));//  java.lang.IndexOutOfBoundsException: Index: 2, Size: 2
	//	System.out.println(al.get(-1));// java.lang.ArrayIndexOutOfBoundsException: -1
	//	System.out.println(al.get(3)); // java.lang.IndexOutOfBoundsException: Index: 3, Size: 2
		
	}

}
