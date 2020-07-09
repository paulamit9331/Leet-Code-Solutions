package StringReverse;
import java.util.*;

public class Solution2 {
	private static Scanner sc = new Scanner(System.in);

	private static String reverse(String str) {
		String res = "";

		if(str.length() == 0)
			return str;
		for(int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
			reverse(str.substring(0, i));
		}
		return res;
	}

	public static void main(String[] args) {
	 	String str = sc.nextLine();

	 	System.out.println(reverse(str));
	 }
}