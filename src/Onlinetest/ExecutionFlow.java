package Onlinetest;

public class ExecutionFlow {
	{
		System.out.println("Instance block1"); //6 11
	}
	static {
		System.out.println("Static Block1");  //1
	}

	public ExecutionFlow() {
		System.out.println("Zero Parametaraised Constructor"); //9
	}

	{
		System.out.println("Instance Block2");  //7 12
	}
	static {
		System.out.println("Static Block2"); //2
	}

	ExecutionFlow(int a) {
		System.out.println(a);      
	}

	public static void main(String[] args) {
		System.out.println("Hai...");  		//4
		ExecutionFlow e = new ExecutionFlow(); //5
		ExecutionFlow e1 = new ExecutionFlow(10, 20);//10
	}

	{
		System.out.println("Instance Block3"); //8 13
	}
	static {
		System.out.println("Static Block3");   //3
	}

	ExecutionFlow(int a, int b) {
		System.out.println(a + b);			//14	
	}
}
