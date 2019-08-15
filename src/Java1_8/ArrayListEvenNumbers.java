package Java1_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class ArrayListEvenNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(2);
		al.add(43);
		al.add(15);
		List<Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());//10,2 even numbers
		System.out.println("Even Numbers:"+l);
		List<Integer> l1=al.stream().filter(i->i%2!=0).collect(Collectors.toList());//43,15 odd numbers
		System.out.println("odd Numbers:"+l1);
		List<Integer> s=al.stream().sorted().collect(Collectors.toList());//2,10,15,43 ascending order
		System.out.println("Ascending Order:"+s);
		List<Integer> s1=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()); //43,15,10,2 decending order
		System.out.println("Decending Order:"+s1);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		}
	}

