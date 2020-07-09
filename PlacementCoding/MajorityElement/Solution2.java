package MajorityElement;
import java.util.*;

public class Solution2 {
	private static Scanner sc = new Scanner(System.in);
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	private static int majority(int[] array) {
		for(int i : array) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if(map.get(i) > array.length / 2)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[] {3, 3, 3, 4, 3, 3, 4, 4, 4};

		System.out.println(majority(array));
	}
}