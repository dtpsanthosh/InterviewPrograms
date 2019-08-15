package Onlinetest;

public class Equals {
	int rno;
	public Equals(int rno) {
		this.rno = rno;
		System.out.println("rollno:" + rno);
	}
/*	public boolean equals(Object o) {
		int r1 = this.rno;
		Equals s2 = (Equals) o;
		int r2 = s2.rno;
		if (r1 == r2) {
			return true;
		} else {
			return false;
		}
	}
*/
	public static void main(String[] args) {
		Equals s = new Equals(10);
		Equals s1 = new Equals(10);
		boolean b1 = s.equals(s1);
		System.out.println(b1);
	}

}
