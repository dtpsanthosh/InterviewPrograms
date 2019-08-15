package interview;
import java.util.HashMap;
class EachCharCountInString {
	static void characterCount(String str) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);		// Printing the charCountMap
	}
	public static void main(String[] args) {
		characterCount("santhosh");
	}
}