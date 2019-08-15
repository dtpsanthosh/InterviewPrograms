package Java1_8;
import java.util.StringJoiner;
public class StringJoinerExample1 {
	public static void main(String[] args) {
		StringJoiner joinNames=new StringJoiner(","); // passing comma(,) as delimiter OP:GSK,kumar,santhosh,hari
		//StringJoiner joinNames = new StringJoiner("," , "[" , "]");  // passing comma(,) and square- OP:[GSK,kumar,santhosh,hari]
		// Adding values to StringJoiner
		joinNames.add("GSK");
		joinNames.add("kumar");
		joinNames.add("santhosh");
		joinNames.add("hari");
		System.out.println(joinNames);
	}
}