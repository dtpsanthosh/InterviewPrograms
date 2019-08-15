package Java1_8;

import java.util.Random;

public class RandomElements {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
	}

}
