package SecondMostOccurringCharacter;
import java.util.*;

class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();

	private static String secondMostOccurringCharacter(String str) {
		for(char ch : str.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		int max = -1;
		for(char ch : map.keySet()) {
			if(map.get(ch) > max) {
				max = map.get(ch);
			}
		}

		int secMax = -1;
		String secMaxCh = "";
		for(char ch : map.keySet()) {
			if(map.get(ch) < max && map.get(ch) > secMax) {
				secMax = map.get(ch);
				secMaxCh = String.valueOf(ch);
			}
		}
		return secMaxCh;
	}

	public static void main(String[] args) {
		String str = "abcacbcac";

		System.out.println(secondMostOccurringCharacter(str));
	}
}