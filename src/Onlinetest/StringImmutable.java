package Onlinetest;

public class StringImmutable {

	public static void main(String[] args) {
		String str=new String("santhosh");
		//str="kumar";
		str.concat("kumar");
		//str=str.concat("kumar");
		System.out.println(str);
		
	/*	String str1=str.concat("kumar");
		System.out.println(str1);//by using this we can change the content of the obeject*/

	}

}
