package Java1_8;
import java.util.StringJoiner;
public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
		System.out.println(joinNames);// Prints nothing because it is empty
		joinNames.setEmptyValue("It is empty");// We can set default empty value.
		System.out.println(joinNames);
		joinNames.add("Rahul");// Adding values to StringJoiner
		joinNames.add("Raju");
		System.out.println(joinNames);
		int length = joinNames.length();// Returns length of StringJoiner
		System.out.println("Length: " + length);
		String str = joinNames.toString(); // Returns StringJoiner as String type
		System.out.println("tostring:"+str);
		// Now, we can apply String methods on it
		char ch = str.charAt(3);
		System.out.println("Character at index 3: " + ch);
		// Adding one more element
		joinNames.add("Sorabh");
		System.out.println(joinNames);
		// Returns length
		int newLength = joinNames.length();
		System.out.println("New Length: " + newLength);
	}
}