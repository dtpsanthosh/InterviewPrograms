package Java1_8;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Snippet {
	public static void main(String args[]) {
	char[] myCharArray = { 'H', 'e', 'l', 'l', 'o', '-', 'X', 'o', 'c', 'e' };
	Stream<Character> myStreamOfCharacters = IntStream
	          .range(0, myCharArray.length)
	          .mapToObj(i -> myCharArray[i]);
	
	List<Character> myListOfCharacters = myStreamOfCharacters.collect(Collectors.toList());
	myListOfCharacters.forEach(System.out::println);
	
}
}

