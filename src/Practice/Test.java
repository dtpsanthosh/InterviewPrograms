package Practice;

public class Test {
	static String first="C";
	static {
		System.out.println("B");
		getPost();
		System.out.println(first);
	}
	public static void main(String[] args) {
		System.out.println("A");
		System.out.print(getPost());
	}
	private static String getPost() {
		first="D";
		return first;
	}

}
