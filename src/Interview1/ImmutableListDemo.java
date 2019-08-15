package Interview1;

import java.io.*;
import java.util.*;
//import com.google.common.collect.ImmutableList; 

class ImmutableListDemo {
	public static void main(String args[]) {
		// creating non-empty list
		List<String> nonempty = new ArrayList<String>();
		nonempty.add("Hai");
		nonempty.add("bye");
		// making list immutable
		List immutable2 = Collections.unmodifiableList(nonempty);
		immutable2.add("hekllo");
		System.out.println(immutable2);
	}
}

