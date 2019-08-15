package Collections;

public class Split {

	public static void main(String[] args) {
		String s = "1200:800:100:2000";
		String[] result = s.split(":");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		

	}

}