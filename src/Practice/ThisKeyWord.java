package Practice;
class tes{
	int a=10;
	int b=20;
}
public class ThisKeyWord extends tes {
	void show() {
	int a=30;
	int b=40;
	System.out.println(this.a);
	System.out.println(a);
	}
	public static void main(String[] args) {
		ThisKeyWord t=new ThisKeyWord();
		t.show();
		
	}

}
