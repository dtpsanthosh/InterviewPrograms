
package interview;

public class TestStringImmutable {

	public static void main(String[] args) {
		String s=new String("santhosh");
		s.concat("kumar");// santhosh kumar stored in s but there is no reference thats why santhosh kumar stored in garbagecollection 
		// finally print santhosh
		System.out.println(s);
	}

}
