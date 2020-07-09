package FirstUniqueCharacter;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();

	private static int firstUniqueChar(String str) {
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch))
				map.put(ch, i);
			else
				map.remove(ch);
		}
		
		int min = Integer.MAX_VALUE;
		for(char ch : map.keySet()) {
			if(map.get(ch) < min)
				min = map.get(ch);
		}
		return min;
	}

	public static void main(String[] args) {
		String str = "leetcode";

		System.out.println(firstUniqueChar(str));
	}
}