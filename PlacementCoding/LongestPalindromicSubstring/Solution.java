package LongestPalindromicSubstring;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static String longestPalindrome(String str) {
		if(str.length() <= 1)
			return str;
		
		String longest = "";
		for(int i = 0; i < str.length(); i++) {
			String temp = palindrome(str, i, i);
			if(temp.length() > longest.length())
				longest = temp;

			temp = palindrome(str, i, i + 1);
			if(temp.length() > longest.length())
				longest = temp;
		}
		return longest;
	}

	private static String palindrome(String str, int begin, int end) {
		while((begin >= 0 && end < str.length()) && (str.charAt(begin) == str.charAt(end))) {
			begin--;
			end++;
		}
		return str.substring(begin + 1, end);
	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome(sc.next()));
	}
}