package Onlinetest;

public class DemoEquals {

	public static void main(String[] args) {
		String s1=new String("gsk"); 
		System.out.println(s1.hashCode());
		String s2="gsk";
		System.out.println(s2.hashCode());
		String s3=s1.intern();
		System.out.println(s3.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		
		
		
	}

}
