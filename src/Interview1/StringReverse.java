package Interview1;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String str;
		// taking string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		str = sc.nextLine();
		// calling method
		strReverse(str);
	}
	private static void strReverse(String str) {
		// converting string to character
		char ch[] = str.toCharArray();
		char reverse[] = new char[ch.length];
		// logic for reverse a string
		for (int i = 0; i < (ch.length); i++) {
			reverse[i] = ch[ch.length - i - 1];
		}

		// printing the reversed string
		System.out.println("Reversed String :");
		System.out.println(new String(reverse));

	}
}