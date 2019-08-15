package interview;

public class SwapWithoutTemp {
	public static void main(String args[]) {
		String a = "gsk";
		String b = "kumar";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		System.out.println(b);
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println("After : " + a + " " + b);
	}
}