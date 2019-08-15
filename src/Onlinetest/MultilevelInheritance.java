package Onlinetest;

class A {
	void m1() {
		System.out.println("m1");
	}
}

class B extends A {
	void m2() {
		System.out.println("m2");
	}
}

class C extends B {
	void m3() {
		System.out.println("m3");
	}
}

public class MultilevelInheritance extends C {

	public static void main(String[] args) {
		MultilevelInheritance i = new MultilevelInheritance();
		i.m1();
		i.m2();
		i.m3();

	}

}
