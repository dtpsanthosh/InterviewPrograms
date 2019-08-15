package Interview1;
class A implements Myinterface{
	public void m1() {
		System.out.println("m1 method");
	}
	public void m2(int a) {
		System.out.println("m2 method1");
	}
	@Override
	public void m2() {
		System.out.println("gsk");
	}
}
class B extends A{
	public void m() {
		System.out.println("m2 method2");
	}
}
public class Test {

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		b.m2(10);
	}

}
