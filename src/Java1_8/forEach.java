package Java1_8;

import java.util.Arrays;
import java.util.List;

public class forEach {
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5);
		//values.forEach(i ->System.out.println(i));
		values.forEach(System.out::println);
		/*for(int i:values) {
			System.out.println(i);
		}*/
		/*for(int i=0;i<values.size();i++) {
			System.out.println(i);
		}*/
	}

}
