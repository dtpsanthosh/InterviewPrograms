package Onlinetest;

import java.util.ArrayList;

class TestGenerics3 {
	public static void main(String args[]) {
		ArrayList<Integer> m = new ArrayList<Integer>();
		//ArrayList<String> m1 = new ArrayList<String>();
		m.add(2);
		//m.add("vivek");//Compile time error
		System.out.println(m.get(0));
	}
}