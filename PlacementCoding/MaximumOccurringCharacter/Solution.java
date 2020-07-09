package MaximumOccurringCharacter;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();

	private static void maxOccurringCharacter(String str) {
		/*for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch))
				map.put(ch, 1);
			else {
				int val = map.get(ch);
				val++;
				map.put(ch, val);
			}
		}*/

		for(char ch : str.toCharArray())				// this has same logic as upper commented section of code
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		int max = -1;
		String maxCh = "";
		for(char ch : map.keySet()) {
			if(map.get(ch) > max) {
				max = map.get(ch);
				maxCh = String.valueOf(ch);
			}
		}
		return maxCh;
	}

	public static void main(String[] args) {
		String str = "abcacbcac";

		maxOccurringCharacter(str);
	}
}