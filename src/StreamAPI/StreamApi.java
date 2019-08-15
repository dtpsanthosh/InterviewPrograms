package StreamAPI;
import java.util.ArrayList;
class StreamApi {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<>();
		names.add("gsk");
		names.add("santhosh");
		names.add("kumar");
		System.out.println("Normal style:");
		for (String name : names) {
			if (!name.equals("gsk")) {
				System.out.println(name);
			}
		}
		System.out.println("Functional style:");
		names.stream().filter(name->!name.equals("gsk")).forEach(System.out::println);
	}
}