package interview;
class TooOldException extends RuntimeException {
	public TooOldException(String s) {
		super(s);
	}
}
	class TooYoungerException extends RuntimeException {
		public TooYoungerException(String s) {
			super(s);
		}
	}

public class CustomizedException {
	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		if(age>60) {
		throw new TooOldException("your age is already crossed marriage age .. no chance of getting marriage");
	}
		else {
			if(age<18) {
				throw new TooYoungerException("please wait some more time you will get best match soon");
			}
			else {
				System.out.println("you will get match details soon ");
			}
		}
}
}
