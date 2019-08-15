package Practice;

abstract class Operation{
	void msg()
	{
		System.out.println("hello friends");
	}
	abstract void twice(int a);
}
	class Programmer1 extends Operation{
		void twice(int x){
			System.out.println("result 1:"+(x+x));
		}
	}
		class Programmer2 extends Operation{
		void twice(int y){
			System.out.println("result 2:"+(y*2));
		}
	}
		class Programmer3 extends Operation{
		void twice(int z){
			System.out.println("result 3:"+(z<<1));
		}		
	}
	
		class AbstractDemo{
			public static void main(String args[]){
				Programmer1 p1=new Programmer1();
				p1.msg();
				p1.twice(5);
				Programmer2 p2=new Programmer2();
				p2.msg();
				p2.twice(6);
				Programmer3 p3=new Programmer3();
				p3.msg();
				p3.twice(8);
			}
		
}
/*
hello friends
result 1:10
hello friends
result 2:12
hello friends
result 3:16
*/

		
			
