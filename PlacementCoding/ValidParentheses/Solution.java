package ValidParentheses;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Stack<Character> stack = new Stack<Character>();

	private static boolean isValid(String str) {
		for(char c : str.toCharArray()) {
			if(c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
				stack.pop();
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
				stack.pop();
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
				stack.pop();
			else
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = sc.next();

		if(isValid(str))
			System.out.println(true);
		else
			System.out.println(false);
	}
}