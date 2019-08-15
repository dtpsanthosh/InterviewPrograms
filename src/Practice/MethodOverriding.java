package Practice;
class T{
	 void m1() {
		System.out.println("1.m1");
	}
}
class H extends T{
	 void m1() {
		System.out.println("2.m1");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		H t=new H();
		t.m1();
	}

}