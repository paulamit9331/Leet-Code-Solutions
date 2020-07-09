package StringReverse;
import java.util.*;

public class Solution1 {
	private static Scanner sc = new Scanner(System.in);
	private static Stack<Character> stack = new Stack<>();

	private static String reverse(String str) {
		String res = "";

		for(int i = 0; i < str.length(); i++)
			stack.add(str.charAt(i));

		while(!stack.empty())
			res += stack.pop();

		return res;
	}

	public static void main(String[] args) {
	 	String str = sc.nextLine();

	 	System.out.println(reverse(str));
	 }
}