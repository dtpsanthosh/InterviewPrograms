package Onlinetest;

class Parent {
	
	static int a = 10;
	Parent(){
		System.out.println("parent constructor");
	}
	static {
		System.out.println("parent static block1...");
		System.out.println(a);
	}
	static {
		System.out.println("Parent static block2...");
	}
}

public class Child extends Parent {
	Child(int i) {
		System.out.println("Child Constructor:"+i);
	}

	public static void main(String[] args) {
		{
			System.out.println("Child main....");
			System.out.println(a);
			Child c = new Child(20);
		}
	}
}
