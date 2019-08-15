package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		Object Test1=new ArrayList().iterator();
		System.out.println((Test1 instanceof List)+",");
		System.out.println((Test1 instanceof Iterator)+",");
		System.out.println(Test1 instanceof ListIterator);
		System.out.println(15/3%3);
		
	}

}
