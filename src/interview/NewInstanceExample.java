package interview;
public class NewInstanceExample {
	String name="gsk";
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*NewInstanceExample obj=new NewInstanceExample();*/
		Class<?> cls = Class.forName("NewInstanceExample");
		NewInstanceExample obj = (NewInstanceExample) cls.newInstance();
		System.out.println(obj.name);
	}
}
//Class is java Class and forname is a static method to load the .class file into class loader area