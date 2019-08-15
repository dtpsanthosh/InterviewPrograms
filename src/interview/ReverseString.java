package interview;
public class ReverseString {

	public static void main(String[] args) {
		String str="VIrtusa Polaris";
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		}
	}

/*import java.util.*;

class ReverseString
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      System.out.println("Reverse of entered string is: "+reverse);
   }
}*/