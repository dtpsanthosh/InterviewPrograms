package Interview1;
class Parent{
	void msg() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void msg() {
		System.out.println("good night");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.msg();
		Parent p1=new Child();
		p1.msg();
		Child c=new Child();
		c.msg();
	/*	Child c1=new Parent();
		c1.msg();  Not allowed*/
	}

}
