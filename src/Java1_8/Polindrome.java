package Java1_8;
import java.util.*;
 
public class Polindrome {
    public static void main(String a[]) {
        System.out.println("Enter any string");
        String s = new Scanner(System.in).next();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) == s.charAt(j));
            else {
                System.out.println("Not Palindrome");
                System.exit(1);
            }
        }
        System.out.println("Palindrome");
    }
}