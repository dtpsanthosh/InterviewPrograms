package StreamAPI;

import java.util.Arrays;
import java.util.OptionalInt;

public class Operations {

	public static void main(String[] args) {
		OptionalInt sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce((a, b) -> a+b);
		System.out.println(sum);
		
		OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
		System.out.println(min);
		
		OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();
		System.out.println(max);
		
		
	}

}
