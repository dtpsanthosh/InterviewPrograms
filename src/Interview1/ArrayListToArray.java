package Interview1;
import java.util.ArrayList;
import java.util.List; 
class ArrayListToArray
{ 
	public static void main (String[] args) 
	{ 
		List<String> al = new ArrayList<String>(); 
		al.add("10"); 
		al.add("20"); 
		al.add("30"); 
		al.add("50"); 
		Object[] objects = al.toArray(); 
		// Printing array of objects 
		for (Object obj : objects) 
			System.out.print(obj + " "); 
	} 
} 
