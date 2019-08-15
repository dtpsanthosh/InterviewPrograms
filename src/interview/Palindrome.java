package interview;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string:");
		s=in.nextLine();
		int length=s.length();
		for(int i=length-1;i>=0;i--) { 
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("Entered String is palindrome");
		}
		else {
			System.out.println("Entered String is not palindrome");
		}}}
