package interview;

public class Swapping {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		System.out.println("Before swaping a value is:"+a);
		System.out.println("Before swapping b value is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping of A value is"+a);
		System.out.println("After swapping of B value is"+b);
	}

}
