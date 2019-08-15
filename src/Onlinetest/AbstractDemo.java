package Onlinetest;
abstract class Operation{
	void msg() {
		System.out.println("Hello gsk");
	}
	abstract void twice(int a);
}
class Cone extends Operation{
	void twice(int a) {
		System.out.println("a value is:"+a);
	}
}
class Ctwo extends Cone{
	void twice(int a,int b) {
		System.out.println(a+b);
		
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Ctwo c=new Ctwo();
		c.msg();
		c.twice(10);
		c.twice(10, 20);
	}

}
