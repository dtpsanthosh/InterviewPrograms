package Interview1;
class MyException extends Exception {
	public MyException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}
// A Class that uses above MyException
public class CustomizedException {
	// Driver Program
	public static void main(String args[]) {
		try {
			// Throw an object of user defined exception
			throw new MyException("user exception");
		} catch (MyException ex) {
			System.out.println("Caught");
			// Print the message from MyException object
			 System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("hai");
		}
		System.out.println("bye");
	}
}