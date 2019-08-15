package interview;

public class Equals {

	public static void main(String[] args) {

		String s1=new String("gsk");
		String s2=new String("gsk");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true  In string class .equals() overrides for content comparison hence even though objts 
											//	are different if the content is same .equals() returns true. 
		StringBuffer sb1=new StringBuffer("gsk");
		StringBuffer sb2=new StringBuffer("gsk");
		System.out.println(sb1.hashCode());//1975012498
		System.out.println(sb2.hashCode());//1808253012
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));
		/*false in string buffer class .equals() is not overridden for content comparison 
		  hence obj class .equals() got executed which is ment for reference comparision due to this if the objts are different
		  .equals() returns false even though content is same.
		 	*/		
	}

}
