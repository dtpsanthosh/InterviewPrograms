package interview;

public class Cloning implements Cloneable{
	 int i = 10;
	 int j = 20;
	public static void main(String[] args)throws CloneNotSupportedException {
		Cloning c=new Cloning();
		Cloning clone = (Cloning) c.clone();
		clone.i=888;
		clone.j=999;
		System.out.println(clone.i+"..."+clone.j);
		System.out.println(c.i+"...."+c.j);
		
	}

}
