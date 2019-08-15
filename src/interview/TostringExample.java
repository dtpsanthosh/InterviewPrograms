package interview;

public class TostringExample {
	String name;
	int no;
	TostringExample(String name,int no){
	this.name=name;
	this.no=no;
	}
	public String toString() { // overriding to string method
		return "Student Name:"+name+"..."+"Student no:"+no;
	}
	public static void main(String[] args) {
		TostringExample s1=new TostringExample("Virtusa", 101);
		TostringExample s2=new TostringExample("santhosh", 102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}
}

/*we can use toString() to get string representation of object-----String s=obj.toString();
--when ever we are trying to print object reference internally toString() will be called---Student s=new String();
--sysout(s.toString());
--if our class does'nt contain toString() then object class toString () will be called
--based on our requirement we can override toString() to provide our own String representation 
--for example when ever we are trying print Student Object reference to print name and no we have to override toString() as 9th line
--op--Student Name:gsk...Student no:101
--Student Name:gsk...Student no:101
--Student Name:santhosh...Student no:102
-- in all wrapper classes , in all collection classes String class StringBuffer and StringBuilder Classes toString() is overridden 
	for meaningful string representation hence it is highly recommanded to override toString() in our class also
	Ex: class Test{
	public String toString(){
	return "testclass";}
	public static void main(String[] args){
	String str=new String("gsk");
	sysout(str);
	Integer i=new Integer(10);
	sysout(i);
	Test t=new Test();
	sysout(t);
*/