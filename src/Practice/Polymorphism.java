package Practice;
class Parent{
	public static void msg(){
		System.out.println("good morning");
	}
}
class Child extends Parent{
	public static void msg(){
		System.out.println("good night");
	}
}
class Polymorphism{
	public static void main(String args[]){
		Child c=new Child();
		c.msg();
		Parent p=c;
		p.msg();
	}
}