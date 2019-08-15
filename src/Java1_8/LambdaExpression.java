package Java1_8;
interface A{
	void show(int i);
}
/*class xyz implements A{
	public void show(int i) {
		System.out.println("Hello:"+i);
	}
}*/ //1 way
public class LambdaExpression {

	public static void main(String[] args) {
		/*A obj;
		obj=new A() {
			public void show(int i) {
				System.out.println("Hello:"+i);
			}
		};*/ // 2nd way
		A obj;
		obj=i->System.out.println("Hello:"+i);  // lambda expression 
		obj.show(6);
	}

}
